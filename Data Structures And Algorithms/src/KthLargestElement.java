import java.util.Arrays;

public class KthLargestElement
{
    public static void main(String[] args) {

        int [] nums={3,2,3,1,2,4,5,5,6};
        KthLargestElement kthLargestElement = new KthLargestElement();
        System.out.println(kthLargestElement.findKthLargest(nums,4));
    }
    public int findKthLargest(int[] nums, int k) {

        int res=0;

        Arrays.sort(nums);
        res=nums[nums.length-k];
        return  res;
    }
}
