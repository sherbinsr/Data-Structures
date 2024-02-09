public class CountNumEvenDigits {

    public static void main(String[] args) {


        CountNumEvenDigits program = new CountNumEvenDigits();
        System.out.println(program.countEven(910));

    }
    public int countEven(int num) {

        int res=0;


        for(int i=1; i<=num; i++)
        {
            if(iseven(i))
            {
                res++;
            }

        }


        return res;
    }
    private boolean iseven(int num)
    {

        int n =num;
        int sum =0;

        while(n>0)
        {
            sum = sum+n%10;
            n=n/10;
        }
        return sum%2==0;
    }
}
