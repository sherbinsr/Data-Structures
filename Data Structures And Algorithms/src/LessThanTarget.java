import java.util.ArrayList;
import java.util.List;

public class LessThanTarget
{
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        LessThanTarget target = new LessThanTarget();
        System.out.println(target.countPairs(nums,2));
    }
    public int countPairs(List<Integer> nums, int target) {

        int arr[] = new int[nums.size()];

        for(int i=0; i< nums.size(); i++)
        {
            arr[i]= nums.get(i);
        }

        int res=0;

        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]<target)
                {
                    res++;
                }
            }
        }

        return res;
    }
}
