public class DetectCaptial {

    public static void main(String[] args) {

        DetectCaptial dc = new DetectCaptial();
        System.out.println(dc.detectCapitalUse("Leetcode"));

    }

    public boolean detectCapitalUse(String word) {



        String upperCase=word.toUpperCase();
        String lowerCase=word.toLowerCase();



        int size = word.length();


        if(word==upperCase || word.length()==1 || size<2 || word==lowerCase)
        {
            return  true;
        }
        else
        {
            return  false;
        }




    }

}