public class NumberOfGoodPairs {

    public static void main(String[] args) {

        int [] nums ={1,1,1,1};
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        System.out.println(goodPairs.numIdenticalPairs(nums));
    }
    public int numIdenticalPairs(int[] nums) {

        int count=0;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }

        return count;
    }
}
