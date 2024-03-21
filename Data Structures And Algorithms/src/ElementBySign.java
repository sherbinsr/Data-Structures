import java.util.ArrayList;
import java.util.List;

public class ElementBySign
{
    public static void main(String[] args) {

        int[] nums={3,1,-2,-5,2,-4};
        ElementBySign element = new ElementBySign();
         int[] res =element.rearrangeArray(nums);
        for (int r:res)
        {
            System.out.println(r);
        }
    }
    public int[] rearrangeArray(int[] nums) {

        List<Integer> negativeSign = new ArrayList<>();
        List<Integer> positiveSign = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negativeSign.add(nums[i]);
            } else {
                positiveSign.add(nums[i]);
            }
        }
        int k = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            result.add(positiveSign.get(i));
            result.add(negativeSign.get(i));
        }

        int[] res = new int[result.size()];

        for (int i=0; i<result.size(); i++)
        {
            res[i]=result.get(i);
        }

        return res;

    }
    /*
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] x = new int[n];
        int i=0,j=1;
        for(int ind = 0;ind<n;ind++) {
            if(nums[ind] > 0) {
                x[i] = nums[ind];
                i+=2;
            } else {
                x[j] = nums[ind];
                j+=2;
            }
        }
        return x;
    }
     */
}
