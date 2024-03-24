import java.util.ArrayList;
import java.util.List;

public class SplitBySeparator
{

    public static void main(String[] args) {

        List<String>words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five.six");
        SplitBySeparator split = new SplitBySeparator();
        System.out.println(split.splitWordsBySeparator(words,'.'));

    }
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String>res = new ArrayList<>();

        for(int i=0; i<words.size(); i++)
        {
           String[] word = words.get(i).split("["+separator+"]");
           for (String splitedWords:word)
           {
                if(splitedWords!="") {
                    res.add(splitedWords);
                }
           }
        }


        return res;
    }
}
