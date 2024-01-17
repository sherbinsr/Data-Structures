public class ArrayPermutations {

    public static void main(String[] args) {

        int nums[]={0,2,1,5,3,4};
        ArrayPermutations permutations = new ArrayPermutations();
        int res[]=permutations.buildArray(nums);
        for(int i=0; i< res.length; i++)
        {
            System.out.println(res[i]);
        }
    }
    public int[] buildArray(int[] nums) {

        int ans[]= new int[nums.length];

        for(int i=0; i< nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
