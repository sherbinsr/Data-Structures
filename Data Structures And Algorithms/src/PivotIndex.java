public class PivotIndex
{
    public static void main(String[] args) {

        int [] nums ={1,7,3,6,5,6};
        PivotIndex index = new PivotIndex();
        System.out.println(index.pivotIndex(nums));
    }
    public int pivotIndex(int[] nums) {

        int sum=0;

        for(int s:nums)
        {
            sum+=s;
        }
        int leftSum=0;
        int rightSum=sum;
        for(int i=0; i< nums.length; i++)
        {

            rightSum-=nums[i];
            if(leftSum==rightSum)
            {
                return i;
            }
            leftSum+=nums[i];

        }
        return -1;
    }

}
