import java.util.Arrays;

public class SquaresSortArray {

    public static void main(String[] args) {

        int []nums={-4,-1,0,3,10};
        SquaresSortArray sortArray = new SquaresSortArray();
        int [] res= sortArray.sortedSquares(nums);

        for (int n:res)
        {
            System.out.println(n);
        }
    }
    public int[] sortedSquares(int[] nums) {

        for(int i=0; i< nums.length; i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);

    return nums;
    }
}
