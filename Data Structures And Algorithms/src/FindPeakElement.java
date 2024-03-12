public class FindPeakElement
{
    public static void main(String[] args) {

        int [] nums ={-2147483648,-2147483647};
        FindPeakElement peakElement = new FindPeakElement();
        System.out.println(peakElement.findPeakElement(nums));
    }
    public int findPeakElement(int[] nums) {

        int res=0;
        int max=0;
        int min=nums[0];
        for (int num:nums) {

        }
        System.out.println(max);
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==max)
            {
                res=i;
                break;
            }
        }
        return res;
    }
}
