import java.util.ArrayList;
import java.util.List;

public class FindPeaks
{

    public static void main(String[] args) {

        int [] mountain ={1,4,3,8,5};
        FindPeaks findPeaks = new FindPeaks();
        System.out.println(findPeaks.findPeaks(mountain));
    }
    public List<Integer> findPeaks(int[] mountain) {

        List<Integer>li = new ArrayList<>();

        for(int i=1; i<mountain.length-1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                li.add(mountain[i]);
            }
        }

        return li;
    }
}
