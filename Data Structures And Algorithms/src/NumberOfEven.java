public class NumberOfEven {

    public static void main(String[] args) {

       int [] nums = {437,315,322,431,686,264,442};
        NumberOfEven numberOfEven = new NumberOfEven();
        System.out.println(numberOfEven.findNumbers(nums));
    }
    public int findNumbers(int[] nums) {

        int res=0;

        for(int i=0; i<nums.length; i++)
        {
            int counter=0;
            while (nums[i]!=0)
            {
                nums[i]=nums[i]/10;
                counter++;
            }
            System.out.println(counter);
            if(counter%2 ==0){
                res++;
            }

        }


        return res;

    }


}
