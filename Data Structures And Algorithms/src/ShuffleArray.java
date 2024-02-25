public class ShuffleArray {

    public static void main(String[] args) {

        int [] nums={2,5,1,3,4,7};
        ShuffleArray shuffleArray = new ShuffleArray();
        int[]res= shuffleArray.shuffle(nums,3);
        for (int num:res)
        {
           // System.out.println(num);
        }
    }
    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[nums.length];
        for(int i=0; i< nums.length; i++)
        {

          if(i%2==0)
          {
              res[i]=nums[i/2];//0,1,2

          }
          else
          {
              res[i]=nums[n+i/2]; ///3,4,5
          }

        }

        return res;
    }
}
