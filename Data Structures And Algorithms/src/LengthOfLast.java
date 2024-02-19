public class LengthOfLast {

    public static void main(String[] args) {

        LengthOfLast length = new LengthOfLast();
        System.out.println(length.lengthOfLastWord("Hello World"));
    }
    public int lengthOfLastWord(String s) {

        int res=0;

        String[] arr=null;

        arr=s.split(" ");

        String word=arr[arr.length-1];

         res=word.length();

        return res;
    }
}
