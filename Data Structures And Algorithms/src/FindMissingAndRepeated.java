import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeated
{

    public static void main(String[] args) {

        int [][] gird =
                {
                        {9,1,7},
                        {8,9,2},
                        {3,4,6}
                };
        FindMissingAndRepeated findMissingAndRepeated = new FindMissingAndRepeated();
        int res[]=findMissingAndRepeated.findMissingAndRepeatedValues(gird);
        for (int r:res)
        {
            System.out.println(r);
        }
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res=new  int[2];


         res[0] =findRepeated(grid);
         res[1]=findMissing(grid);


        return res;
    }

    public int findRepeated(int [][] grid)
    {
        int res=0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i< grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(set.contains(grid[i][j]))
                {
                  res=grid[i][j];
                }
                else
                {
                    set.add(grid[i][j]);
                }
            }
        }

        return res;
    }
    public int findMissing(int [][] grid)
    {
        int n = grid.length;
        int m = n * n;
        int[] numbers = new int[m];
        int k = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[k++] = grid[i][j];
            }
        }
        Arrays.sort(numbers);
        int num=1;
        for(int i=0; i< numbers.length; i++)
        {
            if (numbers[i]==num)
            {
                num++;
            }
        }
        return num;
    }
}
