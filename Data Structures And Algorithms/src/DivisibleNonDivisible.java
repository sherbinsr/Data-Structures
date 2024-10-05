public class DivisibleNonDivisible
{
    public static void main(String[] args) {

        DivisibleNonDivisible divisibleNonDivisible = new DivisibleNonDivisible();
        System.out.println(divisibleNonDivisible.differenceOfSums(10,3));

    }
    public int differenceOfSums(int n, int m) {

        int nonDivsibleSum =0;
        int divsibleSum =0;
        for(int i=1; i<=n; i++)
        {
            if(i%m==0)
            {
                divsibleSum+=i;
            }
            else
            {
                nonDivsibleSum+=i;
            }
        }
        return  nonDivsibleSum-divsibleSum;
    }
}
