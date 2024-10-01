public class ReverseString
{

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Reverse"));
    }

    public  String reverse(String reverse)
    {
        String res="";
        for(int i=reverse.length()-1; i>=0; i--)
        {
            res+=reverse.charAt(i);
        }


        return res;
    }

}
