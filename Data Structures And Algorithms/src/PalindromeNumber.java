public class PalindromeNumber {

    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res =   palindromeNumber.isPalindrome(1321);
        System.out.println(res);

    }

    public  boolean isPalindrome(int num) {

        int reversedNum = 0;

        int remainder;


        int correctnum =num;

        while(num>0) {

            remainder =num%10;

            reversedNum =  reversedNum *10 + remainder;

            num = num/10;
        }


        if(correctnum==reversedNum) {

           return true;

        }else {
            return false;
        }

    }
}
