public class ContainsDuplicate {

    public static void main(String[] args) {

        int nums[]={1,2,3,1};
        ContainsDuplicate containsDuplicate  =  new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {

       // Arrays.sort(nums);
        boolean isduplicate =false;
        for (int i=0; i< nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
                isduplicate=true;
            }
        }

        return isduplicate;
    }
}
