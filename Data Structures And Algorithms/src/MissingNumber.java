import java.util.Arrays;

public class MissingNumber
{

    public static void main(String[] args) {

        int []nums={3,4,-1,1};

        MissingNumber missingNumber= new MissingNumber();
        System.out.println(missingNumber.firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums) {

        int missingValue=1;

        Arrays.sort(nums);
        for(int num:nums)
        {
            if(num>0)
            {
                if(num==missingValue)
                {
                    missingValue++;
                } else if (num>missingValue)
                {
                    break;
                }
            }
        }

        return missingValue;
    }


}
