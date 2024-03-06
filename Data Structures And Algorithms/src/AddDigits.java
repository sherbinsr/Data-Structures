public class AddDigits
{

    public static void main(String[] args) {

        AddDigits digits = new AddDigits();
        System.out.println(digits.addDigits(253));


    }
    public int addDigits(int num) {

        int res=0;

        if(num==0)
        {
            return  res;
        }
        if(num%9==0)
        {
            return 9;
        }
        else
        {
            int calc=num%9;
            return calc;
        }


    }
}
