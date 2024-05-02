import java.util.*;

public class IntersectionMultiple
{

    public static void main(String[] args) {

        int [][] nums ={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        IntersectionMultiple multiple= new IntersectionMultiple();
        System.out.println(multiple.intersection(nums));
    }
    public List<Integer> intersection(int[][] nums) {

        List<Integer>res= new ArrayList<>();

        Map<Integer,Integer>map = new HashMap<>();

        for(int i=0; i< nums.length; i++)
        {
            for(int j=0; j< nums[i].length; j++)
            {
                if(map.containsKey(nums[i][j]))
                {
                    map.put(nums[i][j], map.get(nums[i][j])+1);
                }
                else
                {
                    map.put(nums[i][j],1);
                }
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == nums.length) {
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}
