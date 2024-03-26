import java.util.ArrayList;
import java.util.List;

public class PlusOne {


    public static void main(String[] args) {


        int digits[] ={9};

        PlusOne po = new PlusOne();
       int [] res= po.plusOne(digits);
       for(int num:res)
       {
           System.out.println(num);
       }
    }
    public int[] plusOne(int[] digits) {

        int len = digits.length;

        int add = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i<len-1) {
                list.add(digits[i]);
            }
            if (i == len - 1) {
                add = digits[i] + 1;

                if (add == 10) {
                    list.add(1);
                    list.add(0);
                } else {
                    list.add(digits[i] + 1);
                }
            }
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
