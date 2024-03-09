import java.util.HashSet;
import java.util.Set;

public class MinimumCommonNumber
{

    public static void main(String[] args) {

        int []nums1 ={1,2,3};
        int [] nums2={2,4};
        MinimumCommonNumber commonNumber = new MinimumCommonNumber();
        System.out.println(commonNumber.getCommon(nums1,nums2));
    }
    public int getCommon(int[] nums1, int[] nums2) {

        int res=-1;
        Set<Integer>set=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        for(int i=0; i< nums2.length; i++)
        {
            if(set.contains(nums2[i]))
            {
                res=nums2[i];
                break;
            }
        }


        return res;
    }
}
