public class TwoFurthestHouse
{
    public static void main(String[] args) {

        int [] colors ={1,8,3,8,3};
        TwoFurthestHouse twoFurthestHouse = new TwoFurthestHouse();
        System.out.println(twoFurthestHouse.maxDistance(colors));
    }
    public int maxDistance(int[] colors) {

        int res =0;
        int start=0;
        int end=colors.length-1;
        for (int i=0; i<colors.length; i++)
        {
            int hold=i;
            if(colors[i]!=colors[0])
            {

                res =Math.max(Math.max(res, hold - start), Math.max(res, end - hold));
                System.out.println(res);
            }
        }

        return res;
    }
}
