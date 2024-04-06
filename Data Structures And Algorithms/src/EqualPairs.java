import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EqualPairs
{
    public static void main(String[] args) {

        int [] nums ={1,2,3,4};
        EqualPairs equalPairs = new EqualPairs();
        System.out.println(equalPairs.divideArray(nums));
    }
    public boolean divideArray(int[] nums) {

        Set<Integer>set = new HashSet<>();
        for (int i=0; i< nums.length; i++)
        {
            if(!set.add(nums[i]))
            {
                set.remove(nums[i]);
            }
        }

        return set.isEmpty();
    }


}
