public class PlusOne {


    public static void main(String[] args) {


        int digits[] ={4,3,2,1};

        PlusOne po = new PlusOne();
        po.plusOne(digits);
    }
    public void plusOne(int[] digits) {

        int len= digits.length;

        for(int i=0; i<len; i++)
        {
            if(i==len-1)
            {
                digits[i]=digits[i]+1;
            }
            System.out.println(digits[i]);
        }



    }
}
