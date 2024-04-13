public class EncryptIntegers
{

    public static void main(String[] args) {

        int [] nums ={1,2,3};
        EncryptIntegers integers = new EncryptIntegers();
      System.out.println(integers.sumOfEncryptedInt(nums));
        //System.out.println(integers.calcDigitAndCount(10));

    }
    public int sumOfEncryptedInt(int[] nums) {

        int sum=0;

        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]>9)
            {
                sum+=calcDigitAndCount(nums[i]);
            }
            else
            {
                sum+=nums[i];
            }
        }

        return sum;
    }

    public  int calcDigitAndCount(int n)
    {
        int num=n;
        int count=0;
        int max=0;
        String ans="";
        while (num!=0)
        {
            count++;
            int rem=num%10;
            if(rem>max)
            {
                max=rem;
            }
            num = num/10;
        }
        for(int i=0; i<count; i++) {
            ans += max;
        }
        return Integer.parseInt(ans);
    }
}
