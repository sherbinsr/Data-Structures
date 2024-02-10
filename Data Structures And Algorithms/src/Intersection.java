import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[]  nums1 = {1,2,2,1};
        int[]  nums2 = {2,2};
        Intersection intersection= new Intersection();
        int res []= intersection.intersection(nums1, nums2);
        for(int i=0; i<res.length; i++)
        {
            System.out.println(res[i]);
        }


    }
    public int[] intersection(int[] nums1, int[] nums2) {


        Set<Integer> set1=new HashSet<>();
        for(int i=0; i<nums1.length; i++)
        {
            for(int j=0; j<nums2.length; j++)
            {
                if(nums1[i]==nums2[j])
                {

                    set1.add(nums1[i]);
                }
            }

        }
        int []res= new int[set1.size()];
        int i = 0;
        for (Integer x : set1)
            res[i++] = x;

        return res;

    }
}
