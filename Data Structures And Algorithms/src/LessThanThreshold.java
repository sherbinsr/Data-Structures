public class LessThanThreshold
{

    public static void main(String[] args) {

        int [] nums ={2,11,10,1,3};

        LessThanThreshold less = new LessThanThreshold();
        System.out.println(less.minOperations(nums,10));
    }
    public int minOperations(int[] nums, int k) {

        int count =0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<k)
            {
                count++;
            }
        }


        return count;
    }
}
