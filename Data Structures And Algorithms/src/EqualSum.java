import java.util.HashSet;
import java.util.Set;

public class EqualSum
{

    public static void main(String[] args) {

        int [] nums = {77,95,90,98,8,100,88,96,6,40,86,56,98,96,40,52,30,33,97,72,54,15,33,77,78,8,21,47,99,48};
        EqualSum equalSum = new EqualSum();
        System.out.println(equalSum.findSubarrays(nums));
    }
    public boolean findSubarrays(int[] nums)
    {

        Set<Integer> set = new HashSet<>();

        for(int i=0; i< nums.length-1; i++)
        {
            if(!set.add(nums[i]+nums[i+1]))
            {
                return true;
            }
        }

        return false;
    }
}
