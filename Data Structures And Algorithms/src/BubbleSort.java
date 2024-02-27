public class BubbleSort {

    public static void main(String[] args) {

        int [] nums={5,2,3,1};
        BubbleSort sort = new BubbleSort();
        int [] res = sort.sortArray(nums);
        for (int n:res)
        {
            System.out.println(n);
        }
    }
    public int[] sortArray(int[] nums)
    {
        boolean isSwapped;
        for(int i=0; i< nums.length-1; i++)
        {
            isSwapped=false;
            for(int j=0; j< nums.length-1-i; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false)
            {
                break;
            }

        }

        return nums;
    }
}
