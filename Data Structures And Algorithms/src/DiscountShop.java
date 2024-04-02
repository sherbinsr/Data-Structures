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
        for (int i=0; i<prices.length; i++)
        {
            int j=i+1;
            if(i>j)
            {
                res[i]=prices[i]-prices[j];
            }
        }
        return res;
    }
}
