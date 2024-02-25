public class RichestCustomer {

    public static void main(String[] args) {

        int [][] accounts = {{1,5}, {7,3}, {3,5}};
        RichestCustomer customer = new RichestCustomer();
        System.out.println(customer.maximumWealth(accounts));
    }
    public int maximumWealth(int[][] accounts) {

        int max=0;

        for(int i=0; i< accounts.length; i++)
        {
            int sum=0;
            for(int j=0; j<accounts[i].length; j++)
            {
                sum=sum+accounts[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }

        return max;
    }
}
