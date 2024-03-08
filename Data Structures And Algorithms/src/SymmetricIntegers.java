public class SymmetricIntegers
{

    public static void main(String[] args) {

        SymmetricIntegers symmetricIntegers = new SymmetricIntegers();
        System.out.println(symmetricIntegers.countSymmetricIntegers(1,100));
    }
    public int countSymmetricIntegers(int low, int high) {

        int count=0;

        for(int i=low; i<=high; i++)
        {
            if(i>10)
            {
                String s=""+i;
                int len=s.length();
                if(len%2==0) {
                    String s1 = s.substring(0, len/2);
                    String s2 = s.substring(len/2);

                    if(calcDigit(s1)==calcDigit(s2))
                    {
                        count++;
                    }

                }

            }
        }



        return count;
    }

    public  int calcDigit(String num)
    {
        int s3 = Integer.parseInt(num);
        int res=0;

        int n=s3;
        while (n!=0)
        {
            int right=n%10;
            res+=right;
            n=n/10;
        }

        return res;
    }
}
