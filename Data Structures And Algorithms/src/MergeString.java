public class MergeString
{

    public static void main(String[] args) {

        MergeString mergeString = new MergeString();
         String res =mergeString.mergeAlternately("ab","pqrs");
        System.out.println(res);
    }
    public String mergeAlternately(String word1, String word2) {

        String res="";

        if(word1.length()==word2.length())
        {
            for(int i=0; i<word1.length(); i++)
            {
                res+=word1.charAt(i);
                res+=word2.charAt(i);
            }
        }
        else
        {
            int min =Math.min(word1.length(), word2.length());

            String bigger="";
            if(word1.length()>word2.length())
            {
                bigger="word1";
            }
            else
            {
                bigger="word2";
            }
            for(int i=0; i<min; i++)
            {
                res+=word1.charAt(i);
                res+=word2.charAt(i);
            }
           if(bigger.equals("word1"))
           {
                for (int i=min; i<word1.length(); i++)
                {
                    res+=word1.charAt(i);
                }
           }
           else
           {

               for (int i=min; i<word2.length(); i++)
               {
                   res+=word2.charAt(i);
               }
           }
        }

        return res;
    }
}
