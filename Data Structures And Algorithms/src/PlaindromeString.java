public class PlaindromeString {

    public static void main(String[] args) {

        PlaindromeString ps = new PlaindromeString();

        boolean result = ps.isPalindrome("race a car");
        boolean result2 = ps.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
        System.out.println(result2);

    }

    public boolean isPalindrome(String s) {

        boolean res;

        s = s.replaceAll(",", "");
        s = s.replaceAll(":","");
        s = s.replaceAll(" "," ");
        s = s.replaceAll(".","");
        s = s.toLowerCase();

        int size = s.length();

        String str="";

        for(int i=size-1; i>=0; i--)
        {
            str+=s.charAt(i);

        }

        if(str==s)
        {
            System.out.println(str);
          res =true;
        }
        else
        {
            res = false;
        }

        return res;

    }

}
