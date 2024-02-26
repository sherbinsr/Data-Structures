import java.util.ArrayList;
import java.util.List;

public class AcroynmWord {

    public static void main(String[] args) {

        List<String>words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        AcroynmWord word = new AcroynmWord();
        System.out.println(word.isAcronym(words,"abc"));
    }
    public boolean isAcronym(List<String> words, String s) {

        String res="";
        for (int i=0; i<words.size(); i++)
        {
            res+=words.get(i).charAt(0);
        }
        if(res.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
