import java.util.HashSet;
import java.util.Set;

public class VowelInString
{
    public static void main(String[] args) {

        VowelInString vowelInString = new VowelInString();
        System.out.println(vowelInString.vowelInStr("Running"));

    }

    public  boolean vowelInStr(String Str)
    {
        Set<Character> set = new HashSet<>();
        String vowel ="aeiou";

        for(int i=0; i<vowel.length(); i++)
        {
            set.add(vowel.charAt(i));
        }
        for(int i=0; i<=Str.length(); i++)
        {
            if(set.contains(Str.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

}
