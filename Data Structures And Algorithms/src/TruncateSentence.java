public class TruncateSentence {
    public static void main(String[] args) {

       TruncateSentence truncateSentence = new TruncateSentence();
        System.out.println(truncateSentence.truncateSentence( "Hello how are you Contestant", 4));
    }
    public String truncateSentence(String s, int k) {

        String res="";

        String[] stringArray= null;

        stringArray=s.split(" ");

        for(int i=0; i<stringArray.length; i++)
        {
         if(k>i)
         {
             res+=stringArray[i];
             if(i!=k-1)
             {
                 res+=" ";
             }


         }
        }

        return res;

    }
}
