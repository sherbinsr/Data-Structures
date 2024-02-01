public class SmallestEvenMultiple {
    public static void main(String[] args) {

        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        System.out.println(smallestEvenMultiple.smallestEvenMultiple(7));
    }
    public int smallestEvenMultiple(int n) {

        int res=0;

        if(n%2==0)
        {
            res=n;
        }
        else
        {
            res=n*2;
        }


        return res;
    }
}
