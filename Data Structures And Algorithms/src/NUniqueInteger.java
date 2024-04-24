public class NUniqueInteger
{
    public static void main(String[] args) {

        NUniqueInteger nUniqueInteger = new NUniqueInteger();
        System.out.println(nUniqueInteger.sumZero(5));
    }
    public int[] sumZero(int n) {
        int[] array = new int[n];
        for(int i=1;i<n;i+=2) {
            array[i-1]=i;
            array[i]=-i;
        }
        return array;
    }
}
