import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumFrequency
{

    public static void main(String[] args) {

        int[]nums ={1,2,2,3,1,4};
        MaximumFrequency maximum = new MaximumFrequency();
        System.out.println(maximum.maxFrequencyElements(nums));
    }
    public int maxFrequencyElements(int[] nums) {

        int count=0;

        int max=0;
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {

            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                //In this condition we are checking for already the nums[i] in map if it is already present in the we are just get the frequency value & incrementing it by one;
            }
            else
            {
                map.put(nums[i], 1);
            }
            if(map.containsKey(nums[i])&& map.get(nums[i])>max)
            {
                max=map.get(nums[i]);
                //it will get the maximum frequency value(Count of num);
            }
        }
        List<Integer>li = new ArrayList<>(map.values());

        for (int n:li)
        {
                if(n==max)
                {
                    count+=n;
                }
        }
        return count;
    }
}
