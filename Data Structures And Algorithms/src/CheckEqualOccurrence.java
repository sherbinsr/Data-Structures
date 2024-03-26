import java.util.HashMap;
import java.util.Map;

public class CheckEqualOccurrence
{
    public static void main(String[] args) {

        CheckEqualOccurrence equalOccurrence = new CheckEqualOccurrence();
        System.out.println(equalOccurrence.areOccurrencesEqual("aaabb"));
    }
    public boolean areOccurrencesEqual(String s) {

        Map<Character,Integer>map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int zeroIndex=map.get(s.charAt(0));

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(zeroIndex!= entry.getValue())
            {
                return false;
            }
        }
        return true;
    }
}
