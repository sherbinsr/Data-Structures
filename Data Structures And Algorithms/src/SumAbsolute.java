public class SumAbsolute
{
    public static void main(String[] args) {

        int [] nums ={2,3,5};
        SumAbsolute sumAbsolute= new SumAbsolute();
        int res [] = sumAbsolute.getSumAbsoluteDifferences(nums);
        for(int n:res)
        {
            System.out.println(n);
        }
    }
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int res [] = new int[nums.length];
        for (int i=0; i< nums.length; i++)
        {
            int ans=0;
                for(int j=0; j< nums.length; j++)
                {
                    int x=nums[i]-nums[j];
                    ans+=Math.abs(x);

                }

                res[i]=ans;
        }
         return  res;
    }
}
