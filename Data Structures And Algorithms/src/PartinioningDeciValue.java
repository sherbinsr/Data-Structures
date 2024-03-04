public class PartinioningDeciValue
{

    public static void main(String[] args) {

        PartinioningDeciValue deciValue = new PartinioningDeciValue();
        System.out.println(deciValue.minPartitions("27346209830709182346"));
    }
    public int minPartitions(String n) {

        int res=0;

        int [] nums =new int[n.length()];

        for(int i=0; i<n.length(); i++)
        {
            String s =""+n.charAt(i);

            int num =Integer.parseInt(s);

            if(num>res)
            {
                res=num;
            }
        }


        return res;
    }
}
