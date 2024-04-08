public class CommonPrefixCount
{

    public static void main(String[] args) {

        int[]A ={1,3,2,4};
        int[]B ={3,1,2,4};
        CommonPrefixCount commonPrefixCount = new CommonPrefixCount();
        int res [] = commonPrefixCount.findThePrefixCommonArray(A,B);

        for(int i:res)
        {
            System.out.println(i);
        }
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int res[] = new int[A.length];

        for(int i=0; i<A.length; i++)
        {

            int flag=0;
            for(int j=0; j<A.length; j++)
            {
                if(A[i]==B[j])
                {
                    flag=1;

                }
                if(flag==1 && j>=i)
                {

                    res[j]=res[j]+1;
                }
            }

        }
        return res;
    }
}
