public class SumOfMultiply {
    public static void main(String[] args) {

            SumOfMultiply sumOfMultiply = new SumOfMultiply();
            System.out.println(sumOfMultiply.sumOfMultiples(9));

    }
    public int sumOfMultiples(int n) {

        int res =0;

        for(int i=1; i<=n; i++)
        {

            if(i%3==0 ||i%5==0 ||i%7==0)
            {
                res+=i;
            }
        }
        return res;
    }
}
