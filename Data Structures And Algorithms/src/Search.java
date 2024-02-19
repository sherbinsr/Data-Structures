public class Search {

    public static void main(String[] args) {

        int [] nums ={4,5,6,7,0,1,2};
        Search search = new Search();
        System.out.println(search.search(nums,3));
    }
    public int search(int[] nums, int target) {

        int res=-1;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==target)
            {
               res=i;
               break;
            }
        }

        return res;
    }
}

