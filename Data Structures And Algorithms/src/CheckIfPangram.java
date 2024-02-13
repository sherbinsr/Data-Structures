import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {

    public static void main(String[] args) {

        CheckIfPangram pangram= new  CheckIfPangram();
        System.out.println(pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

    }

    public boolean checkIfPangram(String sentence) {

        boolean res=false;


        Set<Character> set1 = new HashSet<>();

        for(int i=0; i< sentence.length(); i++)
        {
            set1.add(sentence.charAt(i));

        }

        if(set1.size()==26)
        {
            res=true;
        }
        return res;
    }

}
