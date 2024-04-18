import java.util.Arrays;
import java.util.OptionalInt;

public class PeakIndex
{
    public static void main(String[] args) {

        int [] arr = {0,10,5,2};
        PeakIndex peakIndex = new PeakIndex();
        System.out.println(peakIndex.peakIndexInMountainArray(arr));
    }
    public int peakIndexInMountainArray(int[] arr) {

        OptionalInt maximum= Arrays.stream(arr).max();
        int max= maximum.getAsInt();
        for(int i=0; i<arr.length; i++)
        {
            if(max==arr[i])
            {
                return i;
            }
        }

        return 0;
    }
}
