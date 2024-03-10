import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionPivot
{
    public static void main(String[] args) {

        int [] nums={9,12,5,10,14,3,10};
        PartitionPivot partitionPivot = new PartitionPivot();
        int[] res=partitionPivot.pivotArray(nums,10);
        for(int num:res)
        {
            System.out.println(num);
        }
    }
    public int[] pivotArray(int[] nums, int pivot) {

        int [] res =new int[nums.length];
        int lessPivot=0;
        int equalpivot=0;
        int greaterPivot=0;


        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]<pivot)
            {
               res[lessPivot]=nums[i];
               lessPivot++;
            }

        }
       equalpivot=lessPivot;
       for(int i=0; i<nums.length; i++)
       {
            if(nums[i]==pivot)
            {
                res[equalpivot]=nums[i];
                equalpivot++;
            }

       }
       greaterPivot=equalpivot;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>pivot)
            {
                res[greaterPivot]=nums[i];
                greaterPivot++;
            }

        }

        return res;
    }
}
