import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerAndGreater
{
    public static void main(String[] args) {

        int[] nums ={-65982,-69129,-65982,-69129,-65982,-69129,-65982,-69129,-69129,-65982,-65982,-69129,-65982,-69129,-69129,-69129,-65982,-65982,-69129,-69129,-69129,-69129,-65982,-65982,-69129,-65982,-65982,-65982,-69129,-65982,-65982,-65982};
        SmallerAndGreater rightSmaller = new SmallerAndGreater();
        System.out.println(rightSmaller.countElements(nums));
    }
    public int countElements(int[] nums) {

        int count=0;
        Arrays.sort(nums);
        int min=nums[0];
        int max= nums[nums.length-1];


        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]!=min &&  nums[i]!=max)
            {
                count++;
            }

        }

        return count;
    }
}
