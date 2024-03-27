import java.util.Arrays;

public class MinimumNumberGame
{
    public static void main(String[] args) {

        int [] nums= {5,4,2,3};
        MinimumNumberGame numberGame = new MinimumNumberGame();
        int[] res=numberGame.numberGame(nums);
        for (int num:res)
        {
            System.out.println(num);
        }
    }
    public int[] numberGame(int[] nums) {

        int res[] = new int[nums.length];

        Arrays.sort(nums);
        int bob=1;
        int alice=0;
        for(int i=0; i< nums.length; i+=2)
        {
            res[i]=nums[bob];
            bob+=2;
        }
        for(int i=1; i< nums.length; i+=2)
        {
            res[i]=nums[alice];
            alice+=2;
        }
        return res;
    }
}
