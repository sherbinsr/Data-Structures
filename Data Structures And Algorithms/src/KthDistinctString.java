import java.util.HashMap;
import java.util.Map;

public class KthDistinctString
{
    public static void main(String[] args) {

        String [] arr ={"d","b","c","b","c","a"};
        KthDistinctString kthDistinctString = new KthDistinctString();
        System.out.println(kthDistinctString.kthDistinct(arr,2));
    }
    public String kthDistinct(String[] arr, int k) {

        HashMap<String,Integer>map =  new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        int count=0;
        for (int i=0; i< arr.length; i++)
        {
            if (map.get(arr[i])==1)
            {
                count++;
            }
            if(count==k)
            {
                return  arr[i];
            }

        }
        return "";
    }
}

