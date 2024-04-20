import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class LuckyNum
{
    public static void main(String[] args) {

        int [] nums ={2,2,3,4,3,3};
        LuckyNum luckyNum = new LuckyNum();
        System.out.println(luckyNum.findLucky(nums));
    }
    public int findLucky(int[] arr)
    {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1 );
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        int max=0;
       for (Map.Entry<Integer,Integer> m: map.entrySet())
       {
           if(m.getKey()==m.getValue())
           {
               if(max<m.getValue())
               {
                   max=m.getKey();
               }
           }
       }
       if (max==0)
       {
           return -1;
       }
        return max;
    }
}
