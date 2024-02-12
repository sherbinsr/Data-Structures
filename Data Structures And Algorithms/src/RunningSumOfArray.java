public class RunningSumOfArray {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        RunningSumOfArray  runningSumOfArray = new RunningSumOfArray();
        int[] res=runningSumOfArray.runningSum(nums);
        for(int i=0; i< res.length; i++)
        {
            System.out.println(res[i]);
        }
    }
    public int[] runningSum(int[] nums) {

        int[] res= new int[nums.length];

        int add=0;
        for(int i=0; i< nums.length; i++)
        {
            add= add+nums[i];
            res[i]=add;

        }

        return res;
     }
}
