public class CountingBits
{
    public static void main(String[] args) {

        CountingBits countingBits =new CountingBits();
       int []res= countingBits.countBits(5);
       for(int r:res)
       {
           System.out.println(r);
       }
    }
    public int[] countBits(int n) {

        int res[]=new int[n+1];
        res[0]=0;
        for(int i=1; i<=n; i++)
        {
            int k=i;
            int count=0;
           while (k!=0)
           {
                int rem=k%2;
                if(rem==1)
                {
                    count++;
                }
                k=k/2;
           }

           res[i]=count;
        }
        return res;
    }


}
