public class FindMinimum
{

    public static void main(String[] args) {

        int [] nums={2,2,2,0,1};
        FindMinimum min = new FindMinimum();
        System.out.println(min.findMin(nums));
    }
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int j=0; j<nums.length; j++)
        {
            min = Math.min(min,nums[j]);
        }
        return min;
    }
}
