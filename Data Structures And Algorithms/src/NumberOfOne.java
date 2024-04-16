public class NumberOfOne
{

    public static void main(String[] args) {

        NumberOfOne numberOfOne = new NumberOfOne();
        System.out.println(numberOfOne.hammingWeight(128));
    }
    public int hammingWeight(int n) {

        int count=0;
        while (n!=0)
        {
            int rem=n%2;
            if(rem==1)
            {
                count++;
            }
            n=n/2;
        }
        return count;
    }
}
