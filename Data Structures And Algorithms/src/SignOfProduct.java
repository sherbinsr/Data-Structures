public class SignOfProduct
{
    public static void main(String[] args) {

        int[]nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        SignOfProduct signOfProduct = new SignOfProduct();
        System.out.println(signOfProduct.arraySign(nums));

    }
    public int arraySign(int[] nums) {

        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            //if the number is multiplied with 0. the result will be 0. so if the array contains element 0 in it, the sign of the array will be 0.//
            if(nums[i]==0)
            {
                return 0;
            }
            //counting negative integer elements in the array.
            else if(nums[i]<0)
            {
                count++;
            }
        }
        //product of two(even number of) negative values gives a positive value. so if the count is odd it results in giving a negative number.
        if(count%2!=0)
        {
            return -1;
        }
         // if the count is a even number i.e., the product results in giving a positive value.//
        else
        {
            return 1;
        }
     }
}
