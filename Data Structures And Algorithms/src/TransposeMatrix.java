public class TransposeMatrix
{
    public static void main(String[] args) {

        int [][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int [][] res= transposeMatrix.transpose(matrix);

        for (int i=0; i< res.length; i++)
        {
            for(int j=0; j<res[i].length; j++)
            {
                System.out.println(res[i][j]);
            }
        }

    }

    public int[][] transpose(int[][] matrix) {
    int row=matrix.length;
    int col=matrix[0].length;
    int arr[][]=new int[col][row];
    for(int i=0;i<col;i++)
    {
        for(int j=0;j<row;j++)
        {
            arr[i][j]=matrix[j][i];
        }
    }
    return arr;
}

}
