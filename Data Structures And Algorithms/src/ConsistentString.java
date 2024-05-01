import java.util.HashSet;
import java.util.Set;

public class ConsistentString
{
    public static void main(String[] args) {

        String [] words ={"a","b","c","ab","ac","bc","abc"};
        ConsistentString consistentString = new ConsistentString();
        System.out.println(consistentString.countConsistentStrings("abc",words));
    }
    public int countConsistentStrings(String allowed, String[] words) {

        int count=0;

        Set<Character>set = new HashSet<>();
        for(int i=0; i< allowed.length(); i++)
        {
            set.add(allowed.charAt(i));
        }
        for(int i=0; i< words.length; i++)
        {
            int charCount=0;
            String word=words[i];
            for(int j=0; j<word.length(); j++)
            {
                if(!set.contains(word.charAt(j)))
                {
                    charCount=1;
                    break;
                }
            }
            if(charCount==0)
            {
                count++;
            }
        }


        return count;
    }
}
