public class TrallingZeros {

    public static void main(String[] args) {

        TrallingZeros trallingZeros = new TrallingZeros();
        System.out.println(trallingZeros.trailingZeroes(3));
    }
    public int trailingZeroes(int n) {

        int res=0;

        while (n>0)
        {
            n=n/5;
            res+=n;
        }
        return res;
    }
}
