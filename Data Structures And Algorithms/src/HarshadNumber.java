public class HarshadNumber
{
    public static void main(String[] args) {

        HarshadNumber harshadNumber = new HarshadNumber();
        System.out.println(harshadNumber.sumOfTheDigitsOfHarshadNum(18));
    }
    public int sumOfTheDigitsOfHarshadNum(int x) {


        int num=x;

        int sum=0;
        while (num!=0)
        {
            int remain=num%10;
            sum+=remain;
            num=num/10;
        }
        if(x%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }

    }
}
