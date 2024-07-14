public class LeftSumAndRightSum
{
    public static void main(String[] args) {


        int [] nums ={10,4,8,3};
        LeftSumAndRightSum leftSumAndRightSum = new LeftSumAndRightSum();
        int res [] = leftSumAndRightSum.leftRightDifference(nums);

        for (int r:res)
        {
            System.out.println(r);
        }


    }

    public int[] leftRightDifference(int[] nums){
        int[] arr = new int[nums.length];
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            arr[i] = Math.abs(left - right);
            left += nums[i];
        }

        return arr;
    }
   /* public int[] leftRightDifference(int[] nums) {

        int leftSum[] = leftSum(nums);

        int rightSum[] = rightSum(nums);

        int resSum[] = new  int[nums.length];



        for(int i=0; i< nums.length; i++)
        {
            int sum=leftSum[i]-rightSum[i];

            resSum[i]=Math.abs(sum);
        }



        return resSum;

    }
    public  int[] rightSum(int[]nums)
    {
        int rightSum[] = new int[nums.length];
        for (int i=0; i< nums.length; i++)
        {
            int sum =0;
            for (int j=i+1; j< nums.length; j++)
            {
                sum+=nums[j];
            }
           rightSum[i]=sum;
        }
        return rightSum;
    }
    public int[] leftSum(int[] nums)
    {
        int leftSum[] = new int[nums.length];

        leftSum[0]=0;

        int sum=0;
        int j=1;
        for(int i=0; i< nums.length-1; i++)
        {
            sum+=nums[i];
            leftSum[j]=sum;
            if(j< nums.length) {
                j = j + 1;
            }

        }
        return leftSum;

    }

    */
}
