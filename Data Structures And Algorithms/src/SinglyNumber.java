import java.util.Arrays;

public class SinglyNumber {

    public static void main(String[] args) {

        int [] nums ={4,1,2,1,2};
        SinglyNumber singlyNumber = new SinglyNumber();
        System.out.println(singlyNumber.singleNumber(nums));

    }
    public int singleNumber(int[] nums) {


        int val=0;
        for(int i=0; i<nums.length; i++)
        {
            val=val^nums[i];
        }
        return val;
    }
}
