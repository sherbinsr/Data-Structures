public class AllABeforeB {

    public static void main(String[] args) {

        AllABeforeB allABeforeB = new AllABeforeB();
        boolean res = allABeforeB.checkString("aaababb");
        System.out.println(res);


    }
    public boolean checkString(String s) {

        boolean res= true;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='b')
            {
                for(int j=i; j<s.length(); j++)
                {
                    if(s.charAt(j)=='a')
                    {
                        res=false;
                        break;
                    }
                }
                break;

            }
        }

        return res;
    }
}
