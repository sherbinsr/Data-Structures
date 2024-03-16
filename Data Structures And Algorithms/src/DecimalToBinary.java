import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecimalToBinary
{
    public static void main(String[] args) {

        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.println(decimalToBinary.decimalToBinary(125));

    }
    public int decimalToBinary(int n)
    {
        List<Integer>list = new ArrayList<>();
        while (n!=0)
        {
            int remainder=n%2;
            list.add(remainder);
            n=n/2;
        }
        String res="";
        for(int i=list.size()-1; i>=0; i--)
        {
            res+=list.get(i);
        }

        return Integer.parseInt(res);
    }
}
