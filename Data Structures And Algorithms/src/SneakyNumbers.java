import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SneakyNumbers
{
    public static void main(String[] args) {

        int [] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
        SneakyNumbers sneakyNumbers = new SneakyNumbers();
        int res [] = sneakyNumbers.getSneakyNumbers(nums);

        for (int r:res)
        {
            System.out.println(r);
        }


    }
    public int[] getSneakyNumbers(int[] nums)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1 );
            }
            else
            {
                map.put(nums[i] , 1);
            }
        }
        List<Integer>list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==2)
            {
               list.add(entry.getKey());
            }
        }
        int res [] = new int[list.size()];

        for (int i=0; i< list.size(); i++)
        {
            res[i] = list.get(i);
        }

        return res;

    }
}
