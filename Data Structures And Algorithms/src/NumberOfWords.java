public class NumberOfWords {

    public static void main(String[] args) {

        String[] sentences ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        NumberOfWords words = new NumberOfWords();
        System.out.println(words.mostWordsFound(sentences));

    }
    public int mostWordsFound(String[] sentences) {

        int res=0;

        for(int i=0; i< sentences.length; i++)
        {
            String []arr=null;
            for(int j=0; j<sentences[i].length(); j++)
            {
                arr=sentences[i].split(" ");

            }
           if(arr.length>res)
           {
               res= arr.length;
           }
        }

        return res;
    }
}
