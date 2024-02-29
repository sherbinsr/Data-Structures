import java.util.ArrayList;
import java.util.List;

public class SeparateDigit {

    public static void main(String[] args) {

        int [] nums ={13,25,83,77};
        SeparateDigit separateDigit = new SeparateDigit();
        int [] res =separateDigit.separateDigits(nums);
        for (int n:res)
        {
            System.out.println(n);
        }

    }
    public int[] separateDigits(int[] nums) {


        List<Integer>li = new ArrayList<>();

        for(int i= nums.length-1; i>=0; i--)
        {
         int n=nums[i];
         while (n!=0)
         {
             int rightmost=n%10;
             li.add(rightmost);
             n=n/10;
         }
        }
        int[] arr = new int[li.size()];

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=li.get(li.size()-1-i);
        }
        return arr;
    }
}
