public class ElementAndDigitSum
{

    public static void main(String[] args) {

        int [] nums ={1,15,6,3};
        ElementAndDigitSum sum= new ElementAndDigitSum();
        System.out.println(sum.differenceOfSum(nums));
    }
    public int differenceOfSum(int[] nums) {

        int elementsum=0;
        int digitsum=0;

        for(int i=0; i< nums.length; i++)
        {
            elementsum+=nums[i];

            while (nums[i]!=0)
            {
                int rightmost=nums[i]%10;
                digitsum+=rightmost;
                nums[i]=nums[i]/10;
            }
        }

        return elementsum-digitsum;
    }
}
