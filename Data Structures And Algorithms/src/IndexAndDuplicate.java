public class IndexAndDuplicate
{

    public static void main(String[] args) {

        int [] nums={1,2,3,1};
        IndexAndDuplicate indexAndDuplicate = new IndexAndDuplicate();
        System.out.println(indexAndDuplicate.containsNearbyDuplicate(nums,3));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0; i<nums.length; i++)
        {

            if(i==k && nums[i]==k)
            {
                return true;
            }
        }

        return false;
    }

}
