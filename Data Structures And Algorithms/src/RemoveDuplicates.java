public class RemoveDuplicates {

    public static void main(String[] args) {

        int nums[] ={1,1,3,3,2,8};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(nums);


    }

    public int removeDuplicates(int[] nums) {
        for(int i =0; i<nums.length-1; i++)
        {
            for(int k=i+1; k<nums.length; k++)
            {
                if(nums[i] ==nums[k])
                {
                        nums[i]=0;
                }


            }
        }
        for(int j=0; j< nums.length; j++)
        {
            if(nums[j]==0)
            {
                j=j++;
            }
            else {
                System.out.println(nums[j]);
            }
        }
        return 0;
    }
}
