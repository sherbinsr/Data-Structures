public class AbsoluteDifference
{
    public static void main(String[] args) {

        int [] nums ={1,3};
        AbsoluteDifference absoluteDifference = new AbsoluteDifference();
        System.out.println(absoluteDifference.countKDifference(nums,2));
    }
    public int countKDifference(int[] nums, int k) {

        int count=0;

        for(int i=0; i< nums.length; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
                int calc = nums[i] - nums[j];
                int calc2 = nums[j]-nums[i];
                if(calc==k || calc2==k)
                {
                    count++;
                }
            }

        }


        return  count;
    }
}
