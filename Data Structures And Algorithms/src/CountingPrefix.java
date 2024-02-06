import java.util.HashSet;
import java.util.Set;

public class CountingPrefix {


    public static void main(String[] args) {


        String[] words={"lewsmb","lewrydnve","lewqqm","lewec","lewn","lewb","lewedb"};
        CountingPrefix countingPrefix = new CountingPrefix();
        System.out.println(countingPrefix.prefixCount(words,"lew"));
    }
    public int prefixCount(String[] words, String pref) {

        int count=0;

        for(String word:words)
        {
            if(word.startsWith(pref))
            {
                count++;
            }
        }

//        for (int i=0; i<words.length; i++)
//        {
//            String res="";
//            for (int j=0; j<words[i].length()/2; j++)
//            {
//                res+=words[i].charAt(j);
//            }
//           if(res.contains(pref))
//           {
//               count++;
//           }
//        }
        return count;
    }
}
