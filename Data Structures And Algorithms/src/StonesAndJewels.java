import java.util.HashSet;
import java.util.Set;

public class StonesAndJewels {

    public static void main(String[] args) {

        StonesAndJewels stonesAndJewels = new StonesAndJewels();
        System.out.println(stonesAndJewels.numJewelsInStones("Z","ZZ"));

    }
    public int numJewelsInStones(String jewels, String stones) {

        int count =0;
        Set<Character>jewelsset = new HashSet<>();

        for(int i=0; i<jewels.length(); i++)
        {
            jewelsset.add(jewels.charAt(i));
        }
        for(int j=0; j<stones.length(); j++)
        {
            if(jewelsset.contains(stones.charAt(j)))
            {
                count++;
            }
        }
        return count;
    }
}
