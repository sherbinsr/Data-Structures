public class BuyChoco {

    public static void main(String[] args) {

        int prices[]={1,2,2};
        BuyChoco buyChoco = new BuyChoco();
       int res = buyChoco.buyChoco(prices,3);
        System.out.println(res);

    }
    public int buyChoco(int[] prices, int money)
    {
            int lowest=prices[0];
            int secondlowest=prices[0];
        for (int i=0; i< prices.length-1; i++)
        {
            if(lowest>prices[i+1])
            {

                lowest=prices[i];
            }
            if(secondlowest>prices[i+1])
            {
                    if(prices[i]==lowest)
                    {
                        continue;
                    }
                    else
                    {
                        secondlowest = prices[i];
                    }
            }
            if(prices[0]==money)
            {
                return money;
            }
            else if (prices[i]<=money)
            {

                money =money-prices[i];
            } else if (prices[i]<=money)
            {
                int calc = lowest+secondlowest;
                money =money-prices[i];
            }

        }



        return money;
    }

}
