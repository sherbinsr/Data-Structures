public class BitWiseTrailing
{
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        BitWiseTrailing trailing = new BitWiseTrailing();
        System.out.println(trailing.hasTrailingZeros(nums));
    }
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;
        for(int i=0; i< nums.length; i++)
        {

            String bit=Integer.toBinaryString(nums[i]);
            if(bit.charAt(bit.length()-1)=='0')
          {
              count++;
          }
        }
        if(count>=2)
        {
            return true;
        }
        else {

            return false;

        }
    }
}
