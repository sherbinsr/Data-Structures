import java.util.Arrays;

public class MaximumGap
{

    public static void main(String[] args) {

        int [] nums={1,3,100};
        MaximumGap gap = new MaximumGap();
        System.out.println(gap.maximumGap(nums));
    }
    public int maximumGap(int[] nums) {

        int res=0;

        Arrays.sort(nums);
        if(nums.length<2)
        {
            res=0;
        }
        else {
            for (int i = 0; i < nums.length-1; i++) {
                int temp=nums[i+1]-nums[i];
                res =Math.max(res,temp);
            }
        }
        return res;
    }
}
