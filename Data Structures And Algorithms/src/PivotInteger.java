public class PivotInteger
{
    public static void main(String[] args) {

        PivotInteger pivotInteger =new PivotInteger();
        System.out.println(pivotInteger.pivotInteger(8));
    }
    public int pivotInteger(int n) {

        int sum=n*(n+1)/2;

        int sum1=0;
        for(int i=0; i<=n; i++)
        {
            sum1+=i;
            if(sum1==(sum-sum1+i))
            {
                return i;
            }
        }

        return -1;
    }
}
