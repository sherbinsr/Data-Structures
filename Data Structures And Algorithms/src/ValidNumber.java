import java.util.HashSet;
import java.util.Set;

public class ValidNumber {
    public static void main(String[] args) {

        ValidNumber validNumber = new ValidNumber();
        System.out.println(validNumber.isNumber("2e0"));
    }
    public boolean isNumber(String s) {

        boolean res =true;

        String alaphbets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+-,";

        Set<Character> set = new HashSet<>();

        for(int i=0; i<alaphbets.length(); i++)
        {
            set.add(alaphbets.charAt(i));
        }
        for(int i=0; i<s.length(); i++)
        {

            if(set.contains(s.charAt(i)) || s.charAt(i)=='.' && s.length()>=1 ||s.equals("..") )
            {
                res=false;
                break;
            }
        }

       return res;
    }
}
