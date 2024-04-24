public class StringConCatEqual
{

    public static void main(String[] args) {

        String nums [] = {"777","7","77","77"};
        StringConCatEqual stringConCatEqual = new StringConCatEqual();
        System.out.println(stringConCatEqual.numOfPairs(nums,"7777"));
    }

    public int numOfPairs(String[] nums, String target)
    {

        int count =0;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
               String conCat="";
                if(i!=j) {
                     conCat = nums[i] + nums[j];

                }
                    if(target.equals(conCat))
                {
                    count++;
                }
            }
        }

        return count;

    }
}