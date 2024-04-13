import java.util.Arrays;

public class ReversingSubArray
{
    public static void main(String[] args) {

        int [] target ={1,2,3,4};
        int [] arr ={2,4,1,3};
        ReversingSubArray reversingSubArray = new ReversingSubArray();
        System.out.println(reversingSubArray.canBeEqual(target,arr));

    }
    public boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0; i< target.length; i++)
        {
            if(arr[i]!=target[i])
            {
                return false;
            }
        }

        return true;
    }
}
