import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetAfterSort {

    public static void main(String[] args) {

        int[]nums={1,2,5,2,3};
        FindTargetAfterSort sort = new FindTargetAfterSort();
        System.out.println(sort.targetIndices(nums,2));

    }
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer>li= new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==target)
            {
                li.add(i);
            }
        }
        return li;
    }
}
