import java.util.ArrayList;
import java.util.List;

public class KBits
{

    public static void main(String[] args) {

        List<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        KBits kBits = new KBits();
        System.out.println(kBits.sumIndicesWithKSetBits(nums,2));
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int res =0;

        for (int i=0; i<nums.size(); i++)
        {
            int num =nums.get(i);
            boolean ans=isTrue(i,k);
            if(ans==true)
            {
                res+=num;
            }
        }
        return res;
    }
    public boolean isTrue(int n ,int k)
    {
        int count=0;
        while (n!=0)

        {
            int remain=n%2;
            if(remain==1)
            {
                count++;
            }
            n=n/2;

        }

        if(count==k) {
            return true;
        }
        else
        {
            return false;
        }
    }
    /*
     public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.size(); ++i)
        if (Integer.bitCount(i) == k)
            ans += nums.get(i);

        return ans;
    }
     */
}
