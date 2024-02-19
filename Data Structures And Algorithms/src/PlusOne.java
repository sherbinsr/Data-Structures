public class PlusOne {


    public static void main(String[] args) {


        int digits[] ={4,3,2,1};

        PlusOne po = new PlusOne();
       int [] res= po.plusOne(digits);
       for(int num:res)
       {
           System.out.println(num);
       }
    }
    public int[] plusOne(int[] digits) {

        int len= digits.length;

        int add=0;
        for(int i=0; i<len; i++)
        {
            if(i==len-1)
            {
                    add = digits[i] + 1;

                    if(add==10)
                    {
                        digits[i]=0;
                    }
                    else
                    {
                        digits[i]=digits[i]+1;
                    }
            }
        }


     return digits;
    }
}
