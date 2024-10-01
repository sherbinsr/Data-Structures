public class PrimeNumber
{
    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrime(10));
    }

    public  Boolean isPrime(int num)
    {

        if(num<=1)
        {
            return false;
        }
        if(num ==2 )
        {
            return true;
        }

        else
        {
            for (int i=2; i<=num/2; i++)
            {
                if(num % i==0)
                {
                    return false;
                }
            }
        }


        return true;
    }

}
