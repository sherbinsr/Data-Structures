public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {

        int[] nums={6,5,4,8};
        SmallerNumbersThanCurrent numbersThanCurrent = new SmallerNumbersThanCurrent();
        int []res=numbersThanCurrent.smallerNumbersThanCurrent(nums);

        for (int num:res) {

            System.out.println(num);
        }
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] res=new int[nums.length];
        for(int i=0; i< nums.length; i++)
        {
            int count =0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]<nums[i])
                {
                    count++;
                }
            }
            res[i]=count;
        }

        return res;
    }
}
