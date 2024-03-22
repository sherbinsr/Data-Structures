public class PrefixXor
{
    public static void main(String[] args) {

        int [] pref ={5,2,0,3,1};
        PrefixXor xor = new PrefixXor();
        int res [] = xor.findArray(pref);
        for (int r:res)
        {
            System.out.println(r);
        }
    }
    public int[] findArray(int[] pref) {

        int []arr =new int[pref.length];

        arr[0]=pref[0];
        int res=pref[0];
        for (int i=1; i< pref.length; i++)
        {
            arr[i]=res^pref[i];
            res=res^arr[i];
        }

        return arr;
    }
}
