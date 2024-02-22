import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRank {

    public static void main(String[] args) {

        int[]score={5,4,3,2,1};
        RelativeRank rank = new RelativeRank();
        String[]res= rank.findRelativeRanks(score);
        for (String s:res)
        {
            System.out.println(s);
        }
    }
    public String[] findRelativeRanks(int[] score) {

        String[]res= new String[score.length];

        Map<Integer,Integer>map=new HashMap<>();

        int[] sortedarray=score.clone();

        Arrays.sort(sortedarray);

        for (int i = 0; i < score.length; i++) {

            map.put(sortedarray[i], sortedarray.length-i);
        }
        for(int i=0; i<score.length; i++)
        {
            int rank =map.get(score[i]);
            if(rank==1)
            {
                res[i]="Gold Medal";
            } else if (rank==2)
            {
                res[i]="Silver Medal";
            }
            else if (rank==3)
            {
                res[i]="Bronze Medal";
            }
            else
            {
                res[i]=""+rank;
            }

        }

        return res;
    }
}
