public class SearchInsertPosition {

    public static void main(String[] args) {

        int []nums ={1};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(nums,1));
    }
    public int searchInsert(int[] nums, int target) {

        int res=0;
        int last =nums.length;

        if(last<=1 && target!=0)
        {
            return res=1;
        }
        if(last<=1 && target==1)
        {
            return res=0;
        }
        for(int i=0; i<last-1; i++)
        {
            if(target==0)
            {
                res=0;
                break;
            }
           else if(nums[i]==target)
            {
                res=i;
                break;
            }
            else if (target>nums[i] && target<nums[i+1])
            {
                res= i+1;
                break;

            }
            else
            {
                res = nums.length;
            }

        }
        return res;
    }
}
