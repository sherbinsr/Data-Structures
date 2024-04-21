import java.util.HashSet;
import java.util.Set;

public class WordsCanBeFormed
{

    public static void main(String[] args) {

        String [] words ={"cat","bt","hat","tree"};
        WordsCanBeFormed wordsCanBeFormed = new WordsCanBeFormed();
        System.out.println(wordsCanBeFormed.countCharacters(words,"atach"));
    }
    Set<Character> set = new HashSet<>();
    public int countCharacters(String[] words, String chars)
    {

        int res=0;

        for(int i=0; i<chars.length(); i++)
        {
            set.add(chars.charAt(i));
        }

        for(int i=0; i< words.length; i++)
        {
            int count=countMatches(words[i]);

            if(count== words[i].length())
            {
                res+= words[i].length();
            }
        }

        return res;
    }
    public  int countMatches(String word)
    {
        int res=0;
        for(int i=0; i<word.length(); i++)
        {

            if(set.contains(word.charAt(i)))
            {
                res++;
            }

        }

        return res;

    }
}
