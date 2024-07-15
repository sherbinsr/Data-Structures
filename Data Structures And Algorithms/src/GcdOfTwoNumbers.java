public class GcdOfTwoNumbers
{
    public static void main(String[] args)
    {

        int [] nums ={2,5,6,9,10};
        GcdOfTwoNumbers gcd = new GcdOfTwoNumbers();
        System.out.println(gcd.findGCD(nums));
    }
    public int findGCD(int[] nums) {

        int res =0;
        int max=0;
        int min=nums[0];
        for (int i=0; i<nums.length; i++)
        {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }

         res = Gcd(min,max);
        return res;
    }
    public  int Gcd(int n1,int n2)
    {
        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
       return n2;
    }
}
