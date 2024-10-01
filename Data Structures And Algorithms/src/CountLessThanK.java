public class CountLessThanK
{

    public static void main(String[] args) {

       int [] arr = {1, 6, 2, 3, 2, 1};
        int k = 12;

        CountLessThanK countLessThanK = new CountLessThanK();
        System.out.println(countLessThanK.countDp(arr,k));
    }
    public int countDp(int arr[],int k)
    {
        int res =0;
        int product=1;

        for(int i=0; i< arr.length; i++)
        {
            product = arr[i]*product;

            if(product<=k)
            {
                res+=product;
            }

        }


        return  res;

    }
}
