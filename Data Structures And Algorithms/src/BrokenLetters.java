import java.util.HashSet;
import java.util.Set;

public class BrokenLetters
{
    public static void main(String[] args) {

        BrokenLetters brokenLetters = new BrokenLetters();
        System.out.println(brokenLetters.canBeTypedWords("leet code","e"));
    }
    public int canBeTypedWords(String text, String brokenLetters) {

        int res=0;
        String[] temp = null;
        for(int i=0; i<text.length(); i++)
        {
             temp=text.split(" ");
        }
        Set<Character>characterSet = new HashSet<>();
        for (int i=0; i< brokenLetters.length(); i++) {

            characterSet.add(brokenLetters.charAt(i));

        }
        for(int i=0; i< temp.length; i++)
        {
            int flag=0;
            for(int j=0; j<temp[i].length(); j++)
            {
                if (characterSet.contains(temp[i].charAt(j))) {
                   flag=1;
                }
            }
            if(flag==0)
            {
                res++;
            }
        }

        
        return res;
    }
}
