import java.util.HashSet;
import java.util.Set;

public class DistinctInt
{
    public static void main(String[] args) {

        int [] nums ={1,13,10,12,31};
        DistinctInt distinctInt = new DistinctInt();
        System.out.println(distinctInt.countDistinctIntegers(nums));
    }
    public int countDistinctIntegers(int[] nums) {

        Set<Integer>set = new HashSet<>();

        for(int i=0; i< nums.length; i++)
        {
            set.add(nums[i]);
            int reverse=reverseInt(nums[i]);
            set.add(reverse);
        }

        return set.size();
    }
    public  int reverseInt(int num)
    {
        String reverse="";
        while (num!=0)
        {
            int right=num%10;
            reverse+=right;
            num=num/10;

        }

        return Integer.parseInt(reverse);
    }
}
