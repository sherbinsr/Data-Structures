import java.util.HashMap;
import java.util.Map;

public class CommonOccurrence
{
    public static void main(String[] args) {

        String [] words1 ={"leetcode","is","amazing","as","is"};
        String [] words2 ={"amazing","leetcode","is"};
        CommonOccurrence occurrence = new CommonOccurrence();
        System.out.println(occurrence.countWords(words1,words2));
    }
    public int countWords(String[] words1, String[] words2) {

        int count =0;

        Map<String,Integer>map1 = new HashMap<>();
        Map<String,Integer>map2 = new HashMap<>();
        for(int i=0; i<words1.length; i++)
        {
            if(map1.containsKey(words1[i]))
            {
                map1.put(words1[i],map1.get(words1[i])+1);
            }
            else
            {
                map1.put(words1[i],1);
            }
        }
        for(int i=0; i<words2.length; i++)
        {
            if(map2.containsKey(words2[i]))
            {
                map2.put(words2[i],map1.get(words2[i])+1);
            }
            else
            {
                map2.put(words2[i],1);
            }
        }
        for(String s : map1.keySet()) {
            if(map2.containsKey(s) && map2.get(s) == 1 && map1.get(s) == 1) {
               count++;
            }
        }

        return count;
    }
}
