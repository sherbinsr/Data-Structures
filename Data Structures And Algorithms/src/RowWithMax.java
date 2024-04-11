public class RowWithMax
{
    public static void main(String[] args) {

        int [][] mat={{0,1},{1,0}};
        RowWithMax max = new RowWithMax();
        int [] res = max.rowAndMaximumOnes(mat);
        for (int m:res)
        {
            System.out.println(m);
        }
    }
    public int[] rowAndMaximumOnes(int[][] mat) {

        int [] res = new int[2];

        int max=0;
        int row=0;
        for(int i=0; i< mat.length; i++)
        {
            int count=0;
            for (int j=0; j< mat[i].length; j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                row=i;
            }
        }
        res[0]=row;
        res[1]=max;
        return res;
    }
}
