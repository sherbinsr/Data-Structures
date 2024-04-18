public class BinaryPrime
{
    public static void main(String[] args) {

        BinaryPrime bp = new BinaryPrime();
        System.out.println(bp.countPrimeSetBits(6,10));

    }

    public int countPrimeSetBits(int left, int right) {

        int res=0;

        for(int i=left; i<=right; i++)
        {
            int bits=countBits(i);
            if(isPrime(bits))
            {
                res++;
            }
        }

        return res;
    }
    public  int countBits(int bits)
    {
        int count=0;
        while (bits!=0)
        {
            int rem=bits%2;
            if(rem==1)
            {
                count++;
            }
            bits=bits/2;
        }
        return count;
    }

    public boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}