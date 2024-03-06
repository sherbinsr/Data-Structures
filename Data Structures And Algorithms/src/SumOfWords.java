import java.util.HashMap;

public class SumOfWords
{

    public static void main(String[] args) {

        SumOfWords sumOfWords = new SumOfWords();
        System.out.println(sumOfWords.isSumEqual("acb","cba","cdb"));
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        long sum1 = getSumOfCharacters(firstWord) ;
        long sum2 = getSumOfCharacters(secondWord) ;
        long sum3 = getSumOfCharacters(targetWord) ;

        return sum1 + sum2 == sum3 ;
    }

    public long getSumOfCharacters(String s) {
        String sum ="" ;

        for(int i = 0 ; i < s.length() ; i++) {
            int index = (s.charAt(i) - 'a') ;
            sum +=""+ index;
        }

        int getsum=Integer.parseInt(sum);

        return getsum ;
    }
    /*
     public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        long sum1 = getSumOfCharacters(firstWord) ;
        long sum2 = getSumOfCharacters(secondWord) ;
        long sum3 = getSumOfCharacters(targetWord) ;

        return sum1 + sum2 == sum3 ;
    }

    public long getSumOfCharacters(String s) {
        String sum ="" ;

        for(int i = 0 ; i < s.length() ; i++) {
            int index = (s.charAt(i) - 'a') ;
            sum +=""+ index;
        }

        int getsum=Integer.parseInt(sum);

        return getsum ;
    }
     */
}
