import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class SortPeoples {

    public static void main(String[] args) {

        String[]names ={"Mary","John","Emma"};
        int[]heights ={180,165,170};
        SortPeoples sortPeoples = new SortPeoples();
        String[] res = sortPeoples.sortPeople(names,heights);
        for (String s:res)
        {
            System.out.println(s);
        }

    }
    public String[] sortPeople(String[] names, int[] heights)
    {
        String res[]=new String[names.length];

        HashMap<Integer,String>map= new HashMap<>();

        for(int i=0; i< names.length; i++)
        {
            map.put(heights[i],names[i]);
        }
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
        list.sort(Collections.reverseOrder());

        for(int j=0; j< names.length; j++)
        {
          res[j]=map.get(list.get(j));
        }
        return res;
    }
}

