public class DigitDivide
{

    public static void main(String[] args) {

        DigitDivide divide = new DigitDivide();
        System.out.println(divide.countDigits(121));
    }
    public int countDigits(int num) {

        int res =0;
        int n=num;
        while (num!=0)
        {
            int rightMost=num%10;
            if(n%rightMost==0)
            {
                res++;
            }
            num=num/10;
        }

        return res;
    }

}
