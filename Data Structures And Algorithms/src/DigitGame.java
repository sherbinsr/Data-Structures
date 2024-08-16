public class DigitGame
{
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,10};
        DigitGame digitGame = new DigitGame();
        System.out.println(digitGame.canAliceWin(nums));
    }
    public boolean canAliceWin(int[] nums) {

        int lessthan = 0, greaterthan = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 10) {
                lessthan += nums[i];
            } else {
                greaterthan += nums[i];
            }
        }

        int alice = Math.max(lessthan,greaterthan);
        int bob = Math.min(lessthan,greaterthan);

        if(alice>bob)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
