public class Fibonacci
{
    public static void main(String[] args) {


        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(10);

    }
    public  void fibonacci(int num)
    {
        int a =0;

        int b =1;

        int c =1;

        for(int i=0; i<num; i++)
        {
            System.out.println(a);
            a =b;
            b =c;
            c=a+b;
        }
    }
}
