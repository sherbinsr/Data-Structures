import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {

        int[]nums={1,4,3,2};
        ArrayPartition partition = new ArrayPartition();
        System.out.println(partition.arrayPairSum(nums));
    }
    public int arrayPairSum(int[] nums) {

        int res=0;

        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++)
        {
            if (i==0 ||i%2==0)
            {
                res+= nums[i];
            }
        }

        return res;
    }

}
