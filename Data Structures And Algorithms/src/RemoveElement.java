public class RemoveElement {

    public static void main(String[] args) {


        int nums[]={3,2,2,3};

        RemoveElement rm = new RemoveElement();
        int res =rm.removeElement(nums,3);
        System.out.println(res);
    }

    public int removeElement(int[] nums, int val) {

        int count=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
