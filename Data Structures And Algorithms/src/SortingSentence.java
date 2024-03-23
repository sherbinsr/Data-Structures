import java.util.HashMap;
import java.util.Map;

public class SortingSentence
{

    public static void main(String[] args) {

        SortingSentence sorting = new SortingSentence();
        System.out.println(sorting.sortSentence("Myself2 Me1 I4 and3"));
    }
    public String sortSentence(String s) {

        String res="";

        String[] words=s.split(" ");

        Map<Integer,String>map= new HashMap<>();

        for(int i=0; i<words.length; i++)
        {
            String word=words[i];
            int len=word.length()-1;
            int key=Integer.parseInt(String.valueOf(word.charAt(len)));
            String letters="";
            for(int j=0; j< word.length()-1; j++)
            {
                letters+=word.charAt(j);
            }
            map.put(key,letters);
        }
        for (int k=1; k<=map.size(); k++)
        {
            res+=map.get(k)+" ";
        }

        return res.trim();
    }
}
