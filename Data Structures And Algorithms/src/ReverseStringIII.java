public class ReverseStringIII {

    public static void main(String[] args) {

        ReverseStringIII reverseString= new ReverseStringIII();
        System.out.println(reverseString.reverseWords( "Let's take LeetCode contest"));

    }

    public String reverseWords(String s) {
        String res="";
        String []words =null;
        words =s.split(" ");
        String []reverseStrings= new String[words.length];
        for(int i=0; i<words.length; i++)
        {
            String copy=words[i];

            String reverse="";

            for(int j=copy.length()-1;  j>=0; j--)
            {
                reverse+=copy.charAt(j);
            }

            reverseStrings[i]=reverse;


        }
        for(int i=0; i<reverseStrings.length; i++)
        {
            res+=reverseStrings[i];
            if(i!=reverseStrings.length-1)
            {
                res+=" ";
            }


        }
        return res;
    }
}
