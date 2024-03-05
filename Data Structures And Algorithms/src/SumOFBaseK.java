public class SumOFBaseK
{

    public static void main(String[] args) {

        SumOFBaseK baseK = new SumOFBaseK();
        System.out.println(baseK.sumBase(34,6));
    }
    public int sumBase(int n, int k) {

        int res =0;

        while (n>0)
        {
            res+=n%k;
            n /=k;
        }

        return res;
    }
}
