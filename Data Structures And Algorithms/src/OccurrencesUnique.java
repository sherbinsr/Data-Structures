import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccurrencesUnique
{
    public static void main(String[] args) {

        int arr[]={-3,0,1,-3,1,1,1,-3,10,0};
        OccurrencesUnique occurrencesUnique = new OccurrencesUnique();
        System.out.println(occurrencesUnique.uniqueOccurrences(arr));
    }
    public boolean uniqueOccurrences(int[] arr)
    {
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        for(int i=0; i< arr.length; i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else
            {
                hashMap.put(arr[i],1);
            }
        }

        Set<Integer> set = new HashSet<>();

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet())
        {
           if(!set.add(entry.getValue()))
           {
               return false;
           }
        }

        return true;
    }
}
