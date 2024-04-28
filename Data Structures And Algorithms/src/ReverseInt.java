public class ReverseInt {

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.reverse(-321));
    }
    public int reverse(int x) {
        long rev = 0;
        int digit;

        while(x!=0){
            digit = x%10;
            rev  = rev *10+digit;
            x = x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;

        }
        return (int)rev;
    }
}
