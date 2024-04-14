public class FirstPalindromicString
{
    public static void main(String[] args) {

        String [] words = {"notapalindrome","racecar"};
        FirstPalindromicString palindromicString = new FirstPalindromicString();
        System.out.println(palindromicString.firstPalindrome(words));
    }
    public String firstPalindrome(String[] words)
    {
        for(int i=0; i< words.length; i++)
        {
            String res="";
            for(int j=words[i].length()-1; j>=0; j--)
            {
                res+=words[i].charAt(j);
            }
            if(res.equals(words[i]))
            {
                return res;
            }
        }

        return  "";
    }
}
