public class BestStockTime {

    public static void main(String[] args) {

        int prices[]={7,1,5,3,6,4};
        BestStockTime bestStockTime = new BestStockTime();
       int res = bestStockTime.maxProfit(prices);
        System.out.println(res);
    }
    public int maxProfit(int[] prices) {

        int temp =prices[0];
        int profit=0;
        int arr[] = new int[prices.length];

        for(int i=0; i< prices.length; i++) {
            if (temp > prices[i]) {

                temp = prices[i];
            }
        }
        if(temp==prices[prices.length-1])
        {
           profit=0;
        }
        for(int k=0; k<prices.length; k++)
        {
            if(prices[k]==temp)
            {
                for(int j=prices[k]; j<prices.length; j++)
                {
                  arr[j] =prices[j];
                }
            }
        }
        int highest =arr[0];
        for(int x=0; x< arr.length; x++)
        {
            if(highest<arr[x])
            {
                highest=arr[x];
            }
        }
        profit=highest-temp;
        return profit;
    }
}
