public class PalindromeString
{
    public static void main(String[] args) {

        PalindromeString palindromeString = new PalindromeString();

        System.out.println(palindromeString.isPalindrome("mam"));
    }
    public  boolean isPalindrome(String str)
    {

        for(int i=0; i<str.length()/2; i++)
        {

            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }

        }


        return true;

    }



}
