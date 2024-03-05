import java.util.HashMap;

public class ReplaceDigit
{
    public static void main(String[] args) {

        ReplaceDigit replaceDigit = new ReplaceDigit();
        System.out.println(replaceDigit.replaceDigits("a1c1e1d"));
    }
    public String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++)
        {
            char c =s.charAt(i);

            if(c>='a' && c<='z')
            {
                sb.append(c);
            }
            else
            {
                int ascii=s.charAt(i-1);
                char ch =covert(c,ascii);
                sb.append(ch);
            }
        }
           return sb.toString();
    }
    public char covert(char c,int ascii)
    {
        int d =(c-'0')+ascii;
        char ch =(char)d;
        return ch;
    }


}
