public class SumProduct {

    public static void main(String[] args) {

        SumProduct sumProduct = new SumProduct();
        System.out.println(sumProduct.subtractProductAndSum(234));
    }
    public int subtractProductAndSum(int n) {

        int res=0;

       int product=1;
       int sum =0;
       while (n>0)
       {
           int rightmost=n%10;
           product =product*rightmost;
           sum = sum+rightmost;
           n=n/10;
       }

        res=product-sum;
        return res;
    }

}
