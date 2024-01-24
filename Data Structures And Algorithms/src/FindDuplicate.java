import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] nums ={4,3,2,7,8,2,3,1};
        FindDuplicate findDuplicate = new FindDuplicate();
        System.out.println(findDuplicate.findDuplicates(nums));
    }
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer>sortedList = new ArrayList<>();


       // Arrays.sort(nums);

        for (int i=0; i< nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
               sortedList.add(nums[i]);
            }
        }

        return sortedList;
    }
}
