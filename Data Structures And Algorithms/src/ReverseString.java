public class ReverseString {
    public static void main(String[] args) {

        char [] s ={'H','a','n','n','a','h'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
    }
    public void reverseString(char[] s) {


        int j=0;
        for (int i=s.length-1; i>=0; i--)
        {
           s[j]=s[i];
           j=i-1;

        }
        for (int i=0; i<s.length; i++)
        {
            System.out.print(s[i]);
        }

    }
}
