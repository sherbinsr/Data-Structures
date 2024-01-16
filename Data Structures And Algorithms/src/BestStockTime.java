public class BestStockTime {

    public static void main(String[] args) {

        int prices[]={2,4,1};
        BestStockTime bestStockTime = new BestStockTime();
       int res = bestStockTime.maxProfit(prices);
        System.out.println(res);
    }
    public int maxProfit(int[] prices) {

        int temp =prices[0];
        int isDecrement =prices[0];
        int profit=0;
        int arr[] = new int[prices.length];

        int keepCount=0;
        if(prices.length==1){
            return profit=0;
        }

        for(int i=0; i< prices.length; i++) {
            if (temp > prices[i]  ) {

                temp = prices[i];
            }
            if(isDecrement>prices[i])
            {
                keepCount++;
                isDecrement=prices[i];
            }

        }

        if(keepCount==prices.length-1)
        {
           profit=0;
        }
        else {

            for (int k = 0; k < prices.length; k++) {
                if (prices[k] == temp) {
                    for (int j = prices[k]; j <prices.length; j++) {
                        arr[j] = prices[j];

                    }
                }
            }
            int highest = arr[1];
            for (int x = 0; x < arr.length; x++) {
                if (highest < arr[x]) {
                    highest = arr[x];
                }
            }

            profit = highest - temp;
        }
        if(prices[0]==prices[1])
        {
            return profit=0;
        }

        return profit;
    }
}
