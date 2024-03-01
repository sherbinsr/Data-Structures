public class CountNegativeNum
{
    public static void main(String[] args) {

        int [][] gird={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        CountNegativeNum negativeNum = new CountNegativeNum();
        System.out.println(negativeNum.countNegatives(gird));
    }
    public int countNegatives(int[][] grid) {

        int res=0;

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(grid[i][j]<0)
                {
                    res++;
                }
            }
        }

        return res;
    }
}
