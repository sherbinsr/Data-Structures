public class MaximizeSum {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};
        MaximizeSum maximizeSum = new MaximizeSum();
        System.out.println(maximizeSum.maximizeSum(nums,3));
    }
    public int maximizeSum(int[] nums, int k) {

        int res=0;

        int max=0;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]>=max)
            {
                max=nums[i];
            }
        }
        while (--k>=0)
        {
            res +=max+k;
        }


        return res;
    }
}
