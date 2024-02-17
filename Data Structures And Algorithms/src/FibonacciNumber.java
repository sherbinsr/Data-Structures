public class FibonacciNumber {
    public static void main(String[] args) {

        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(4));
    }
    public int fib(int n) {

        if(n==0)
        {
         return 0;
        }
        if (n==1)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);  //for fib(n==4);
                                        //fib(3)+fib(2);
                                        //fib(3-1)+fib(2-1);
                                        //2+1;
                                        //3

       

    }
}
