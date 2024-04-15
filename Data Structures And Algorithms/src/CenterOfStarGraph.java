import java.util.HashSet;
import java.util.Set;

public class CenterOfStarGraph
{
    public static void main(String[] args) {

        int [][]edges ={
                {1,2}
                ,{5,1}
                ,{1,3}
                ,{1,4}
        };
        CenterOfStarGraph centerOfStarGraph = new CenterOfStarGraph();
        System.out.println(centerOfStarGraph.findCenter(edges));
    }
    public int findCenter(int[][] edges) {

        int res=0;
        Set<Integer>set = new HashSet<>();
        for(int i=0; i<edges.length; i++)
        {
            for (int j=0; j<edges[i].length; j++)
            {
                if(!set.add(edges[i][j])){

                    return edges[i][j];
                }
            }
        }

        return res;
    }
}
