public class PowerOfThree
{

    public static void main(String[] args) {

        PowerOfThree three = new PowerOfThree();
        System.out.println(three.isPowerOfThree(27));
    }
    public boolean isPowerOfThree(int n) {

        while (n!=1)
        {
            if(n%3==0)
            {
                n=n/3;
            }
        }

        return n==1;

    }


}
