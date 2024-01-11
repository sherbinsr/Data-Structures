public class TwoSums {

    public static void main(String[] args) {


        int nums[]={2,7,11,15};
        TwoSums ts = new TwoSums();
        ts.twoSum(nums,9);
    }

    public void twoSum(int[] nums, int target) {

        for(int i =0; i<nums.length-1; i++)
        {

            for(int k=i+1; k<nums.length; k++)
            {
                int add = nums[i]+nums[k];

                if(add==target)
                {
                    System.out.println(i+","+k);
                }

            }

        }


    }

}
