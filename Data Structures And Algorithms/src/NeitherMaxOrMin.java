public class NeitherMaxOrMin
{

    public static void main(String[] args) {

        int[]nums={3,2,1,4};
        NeitherMaxOrMin maxOrMin = new NeitherMaxOrMin();
        System.out.println(maxOrMin.findNonMinOrMax(nums));
    }
    public int findNonMinOrMax(int[] nums) {

        int res=0;
        if(nums.length<=2)
        {
            res=-1;
        }
        else
        {
            int max=0;
            int min=nums[0];
            for(int i=0; i<nums.length; i++)
            {
                min = Math.min(min,nums[i]);
                max =Math.max(max,nums[i]);
            }
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]!=min && nums[j]!=max)
                {
                    res=nums[j];
                    break;
                }
            }
        }
        return res;
    }
}
