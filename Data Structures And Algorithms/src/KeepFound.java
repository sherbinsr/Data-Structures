import java.util.HashSet;
import java.util.Set;

public class KeepFound
{
    public static void main(String[] args) {

        int [] nums ={5,3,6,1,12};
        KeepFound keepFound = new KeepFound();
        System.out.println(keepFound.findFinalValue(nums,3));

    }
    public int findFinalValue(int[] nums, int original) {

        Set<Integer>set = new HashSet<>();

        for(int i:nums)
        {
            set.add(i);
        }

        int res =original;

        while (set.contains(res))
        {
            res=res*2;
        }

        return res;
    }

}
