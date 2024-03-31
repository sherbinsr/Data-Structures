public class SmallestIndexK
{
    public static void main(String[] args) {

        int [] nums ={1,2,3,4,5,6,7,8,9,0};
        SmallestIndexK smallestIndexK = new SmallestIndexK();
        System.out.println(smallestIndexK.smallestEqual(nums));
    }
    public int smallestEqual(int[] nums) {

        int res=-1;
        for(int i=0; i< nums.length; i++)
        {
            int mod=i%10;
            if(mod==nums[i])
            {
               res=i;
               break;
            }

        }
        return res;
    }
}
