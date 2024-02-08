public class CountNegativeNumber {
    public static void main(String[] args) {

        int[] nums = {5,20,66,1314};
        CountNegativeNumber countNegativeNumber = new CountNegativeNumber();
        System.out.println(countNegativeNumber.maximumCount(nums));
    }

    public int maximumCount(int[] nums) {

        int count=0;
        int count2=0;
        int res=0;
        for (int i=0; i< nums.length; i++)
        {
            if(nums[i]<=0)
            {

                count++;
            }
            if(nums[i]>=0)
            {
                count2++;
            }
        }

        if(count==count2)
        {
            res=count2;
        }
        else if(count<count2)
        {
            res=count2;
        }
        else
        {
            res=count;
        }

        return res;
    }
}
