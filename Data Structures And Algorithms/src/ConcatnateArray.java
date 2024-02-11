public class ConcatnateArray {

    public static void main(String[] args) {

        int []  nums = {1,2,1};
        ConcatnateArray concatnateArray = new ConcatnateArray();
        int [] res= concatnateArray.getConcatenation(nums);
        for(int k=0; k< res.length; k++)
        {
            System.out.println(res[k]);
        }
    }
    public int[] getConcatenation(int[] nums) {

        int resLen= nums.length*2;
        int res[]= new int[resLen];

        for(int i=0; i< nums.length; i++)
        {
            res[i]=nums[i];
        }
        int i=0;
        for(int j= nums.length; j< resLen; j++)
        {

            res[j]=nums[i];
            i=i+1;
        }

        return res;

    }
}
