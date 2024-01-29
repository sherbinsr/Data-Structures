import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {

    public static void main(String[] args) {

        int [] nums ={4,2,1,1};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));

    }
    public int majorityElement(int[] nums) {

        int res=0;
        Arrays.sort(nums);
        int calcMajorElement= nums.length/2;
        res=nums[calcMajorElement];
        return res;

    }

}
