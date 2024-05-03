import java.util.HashMap;
import java.util.Map;

public class FirstUniqueLetter
{

    public static void main(String[] args) {
        FirstUniqueLetter fi = new FirstUniqueLetter();
        System.out.println(fi.firstUniqChar("leetcode"));
    }
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(charCount.containsKey(c)) {

                charCount.put(c, charCount.get(c) + 1);
            }
            else
            {
                charCount.put(c,1);
            }
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return i;
            }
        }


        return -1;
    }
}
