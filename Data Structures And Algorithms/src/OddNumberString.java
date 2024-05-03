public class OddNumberString
{

    public static void main(String[] args) {

        OddNumberString odd  = new OddNumberString();
        System.out.println(odd.largestOddNumber("35427"));
    }
    public String largestOddNumber(String num) {

        String res="";

        for(int i=0; i<num.length(); i++)
        {
            String number=""+num.charAt(i);
            int n=Integer.parseInt(number);
            if(n%2!=0)
            {
                res+=n;
            }
        }

        return res;
    }

}
