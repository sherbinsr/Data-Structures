public class CommonElement {

    public static void main(String[] args) {

        int nums1[]={4,3,2,3,1};
        int nums2[]={2,2,5,2,3,6};
        CommonElement cm = new CommonElement();
        cm.findIntersectionValues(nums1,nums2);
    }
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int[] nums= new int[1];
        int count=0;
          int  count2=0;
        for(int i=0; i<nums1.length; i++)
        {
            int flag=0;
            for (int k=0; k< nums2.length; k++)
            {
                if(nums1[i]==nums2[k])
                {
                  flag=1;
                }
            }
            if(flag!=0)
            {
                count++;
            }
        }

        nums[0]=count;


        for(int i=0; i<nums2.length; i++)
        {
            int flag=0;
            for (int k=0; k< nums1.length; k++)
            {
                if(nums2[i]==nums1[k])
                {
                    flag=1;
                }
            }
            if(flag!=0)
            {
                count2++;
            }
        }
      nums[1]=count2;
        return nums;

    }

}

