public class CommonFactor {

    public static void main(String[] args) {

        CommonFactor commonFactor= new CommonFactor();
        System.out.println(commonFactor.commonFactors(12,6));
    }
    public int commonFactors(int a, int b) {

        int counter=0;

        int res=0;

        if(a<b)
        {
            res=b;

        }
        else
        {
            res=a;
        }
       for(int i=1; i<=res; i++)
       {
           if(a%i==0 && b%i==0)
           {
               counter++;
           }
       }


        return counter;
    }
}
