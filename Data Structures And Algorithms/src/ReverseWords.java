public class ReverseWords {

    public static void main(String[] args) {

        ReverseWords reverseWords= new ReverseWords();
        System.out.println(reverseWords.reverseWords("the sky is blue"));
    }
    public String reverseWords(String s) {
        String res="";
        String []words =null;
        words =s.split(" +");
        String []reverseStrings= new String[words.length];
        for(int i=words.length-1; i>=0; i--)
        {

            if(i==0)
            {
                res+=words[i];
                continue;

            }
            else
            {   res+=words[i];
                res+=" ";
            }
        }

        return res.trim();

    }
}
