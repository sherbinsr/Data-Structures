import java.util.HashSet;
import java.util.Set;

public class VowelInRange
{

    public static void main(String[] args) {

        String[]words={"are","amy","u"};
        VowelInRange vowel = new VowelInRange();
        System.out.println(vowel.vowelStrings(words,0,2));
    }
    public int vowelStrings(String[] words, int left, int right) {

        int res=0;

        Set<Character> set =new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('d');
        for(int i=left; i<=right; i++)
        {
            if(set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length()-1)))
            {
                res++;
            }
        }

        return res;
    }
}
