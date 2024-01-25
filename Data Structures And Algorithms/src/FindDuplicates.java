import java.util.Arrays;

public class FindDuplicates {


    public static void main(String[] args) {

        int[] nums ={3,1,3,4,2};
        FindDuplicates findDuplicate = new  FindDuplicates();
        System.out.println(findDuplicate.findDuplicate(nums));
    }
    public int findDuplicate(int[] nums) {

          int duplicate=0;

          Arrays.sort(nums);

        for (int i=0; i< nums.length-1; i++)
        {
                if(nums[i]==nums[i+1])
                {
                    duplicate=nums[i];

                }
        }

        return duplicate;

    }
}
