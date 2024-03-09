import java.util.Arrays;

public class MissingValue
{

    public static void main(String[] args) {

        int[]nums={0,2,3,4,5,6};
        MissingValue missingValue = new MissingValue();
        System.out.println(missingValue.missingNumber(nums));
    }
    public int missingNumber(int[] nums) {

        int sum=0;

        int actualsum=0;
            for (int i=0; i<nums.length; i++) {

                sum+=nums[i];
             }
            actualsum =nums.length*(nums.length+1)/2;

        return actualsum-sum;
    }
}
