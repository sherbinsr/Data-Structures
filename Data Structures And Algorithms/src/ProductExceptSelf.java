public class ProductExceptSelf
{
    public static void main(String[] args) {

        int [] nums ={1,2,3,4};
        ProductExceptSelf exceptSelf = new ProductExceptSelf();
        int[]res=exceptSelf.productExceptSelf(nums);
        for (int j:res)
        {
            System.out.println(j);
        }
    }
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
        }

        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
}
