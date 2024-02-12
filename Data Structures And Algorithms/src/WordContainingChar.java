import java.util.ArrayList;
import java.util.List;

public class WordContainingChar {
    public static void main(String[] args) {
       String[]words = {"leet","code","xyz"};
        WordContainingChar wordContainingChar = new WordContainingChar();
        System.out.println(wordContainingChar.findWordsContaining(words,'e'));
    }
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer>li = new ArrayList<>();
        for(int i=0; i<words.length; i++)
        {
            String s=""+x;
            if(words[i].contains(s))
            {
                li.add(i);
            }
        }

        return li;
    }
}
