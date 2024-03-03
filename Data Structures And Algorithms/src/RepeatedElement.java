import java.util.Arrays;

public class RepeatedElement
{
    public static void main(String[] args) {

        int [] nums ={5,1,5,2,5,3,5,4};
        RepeatedElement repeatedElement = new RepeatedElement();
        System.out.println(repeatedElement.repeatedNTimes(nums));
    }
    public int repeatedNTimes(int[] nums) {

        int res =0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==nums[i+1])
            {
                return res=nums[i];
            }

        }

        return res;
    }
}
