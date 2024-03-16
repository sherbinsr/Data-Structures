public class BinaryToDecimal
{
    public static void main(String[] args) {

        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.binaryToDecimal(1111101));
    }
    public int binaryToDecimal(int n)
    {
        int i=0;
        int res=0;
        while (n!=0)
        {
            int digit=n%10;
            double d =Math.pow(2,i);
            res+=digit*d;
            n=n/10;
            i++;
        }

        return res;
    }

}
