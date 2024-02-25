public class DivisibleAndNonDivisible {

    public static void main(String[] args) {

        DivisibleAndNonDivisible divisible = new DivisibleAndNonDivisible();
        System.out.println(divisible.differenceOfSums(10,3));
    }
    public int differenceOfSums(int n, int m) {

        int res=0;
        int add1=0;
        int add2=0;
        for(int i=1; i<=n; i++)
        {
            if(i%m!=0)
            {
                add1 += i;
            }
            else
            {
                add2+=i;
            }
        }

        res=add1-add2;
        return res;
    }
}
