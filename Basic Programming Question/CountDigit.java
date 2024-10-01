public class CountDigit
{
    public static void main(String[] args) {


        int num =3234;

        int count =0;
        while (num >0)
        {
            int remainder =num%10;

            num= num/10;
            //counts number of digits
            count++;
            //prints number in reverse
            System.out.println(remainder);

        }
        System.out.println(count);

    }
}
