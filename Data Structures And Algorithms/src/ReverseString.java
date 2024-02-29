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
            char temp=s[i];
           s[j]=s[i];
           s[i]=temp;
           j=i-1;

        }


    }
}
