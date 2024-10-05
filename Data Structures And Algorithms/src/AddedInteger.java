public class AddedInteger
{
    public static void main(String[] args) {

        int [] nums1 = {2,6,4};
        int [] nums2 = {9,7,5};
        AddedInteger addedInteger = new AddedInteger();
        System.out.println(addedInteger.addedInteger(nums1,nums2));

    }
    public int addedInteger(int[] nums1, int[] nums2) {

        int min1=nums1[0];
        int min2=nums2[0];
        for(int i=1; i< nums1.length; i++)
        {
            min1= Math.min(min1,nums1[i]);
            min2= Math.min(min2,nums2[i]);

        }
        return min2-min1;
    }
}
