import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueElement
{
    public static void main(String[] args) {

        int [] nums={1,2,3,2};
        UniqueElement uniqueElement = new UniqueElement();
        System.out.println(uniqueElement.sumOfUnique(nums));
    }
    public int sumOfUnique(int[] nums) {
        int res=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
           if(map.containsKey(nums[i])){

               map.put(nums[i],map.get(nums[i])+1);
           }
           else
           {
               map.put(nums[i],1);
           }
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet())
            {
                if(entry.getValue()==1)
                {
                    res+= entry.getKey();
                }
            }
        return res;
        }
}
