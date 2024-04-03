public class DiscountShop
{
    public static void main(String[] args) {
        int[] prices ={8,4,6,2,3};
        DiscountShop discountShop = new DiscountShop();
        int dis[]=discountShop.finalPrices(prices);
        for (int di:dis)
        {
            System.out.println(di);
        }
    }
    public int[] finalPrices(int[] prices) {

        int[] res=new int[prices.length];
        for(int i=0; i< prices.length; i++)
        {
             res[i]=prices[i];
            for(int j=i+1; j< prices.length; j++)
            {
                if(prices[j] <= prices[i])
                {
                    res[i]-=prices[j];
                    break;
                }



            }
        }
        return res;
    }
}
