import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public static void main(String[] args) {

        SelfDividingNumber selfDividingNumber = new SelfDividingNumber();
        System.out.println(selfDividingNumber.selfDividingNumbers(1,22));
    }
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer>list = new ArrayList<>();

        for(int i=left; i<=right; i++)
        {
            if(i<=9)
            {
                list.add(i);
                continue;
            }
            int n=i;
            int count1=0;
            int count2=0;
            while (n>0)
            {
                count1++;//it counts how many digits te given number is
                int rightmost=n%10;
                n=n/10;
                if(rightmost==0)
                {
                    continue;
                }
               if(i%rightmost==0)
               {
                   count2++;//it counts how many element in n is divisble by the same number
               }
            }
            if(count1==count2)
            {
                list.add(i);
            }
        }

        return list;
    }

}
