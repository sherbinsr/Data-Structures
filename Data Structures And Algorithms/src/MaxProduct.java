public class MaxProduct
{
    public static void main(String[] args) {

        int [] nums ={3,7};
        MaxProduct product = new MaxProduct();
        System.out.println(product.maxProduct(nums));
    }
    public int maxProduct(int[] nums) {

        int max=0;

        int product=0;
        for(int i=0; i< nums.length; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
                product = (nums[i]-1)*(nums[j]-1);
                if(product>max)
                {
                    max=product;
                }
            }

        }
        return max;
    }
}
