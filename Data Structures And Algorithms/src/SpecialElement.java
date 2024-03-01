public class SpecialElement
{

    public static void main(String[] args) {

        int [] nums ={2,7,1,19,18,3};
        SpecialElement specialElement = new SpecialElement();
        System.out.println(specialElement.sumOfSquares(nums));
    }
    public int sumOfSquares(int[] nums) {

        int res=0;

        for(int i=0; i< nums.length; i++)
        {
                if(nums.length%(i+1)==0)
                {
                    res+=nums[i]*nums[i];
                }

        }
        return res;
    }
}
