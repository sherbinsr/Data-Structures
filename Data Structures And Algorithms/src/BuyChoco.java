import java.util.Arrays;

public class BuyChoco {

    public static void main(String[] args) {

        int prices[]={98,54,6,34,66,63,52,39};
        BuyChoco buyChoco = new BuyChoco();
       int res = buyChoco.buyChoco(prices,62);
        System.out.println(res);

    }
    public int buyChoco(int[] prices, int money)
    {

        Arrays.sort(prices);

        int buy=prices[0]+prices[1];

        if(buy<=money)
        {
            return money-buy;
        }


        return money;
    }

}
