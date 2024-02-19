import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {

    public static void main(String[] args) {

        MinimizeStringLength stringLength = new MinimizeStringLength();
        System.out.println(stringLength.minimizedStringLength("aaabcd"));
    }
    public int minimizedStringLength(String s) {

        int res=0;

        Set<Character>set = new HashSet<>();

        for(int i=0; i<s.length(); i++)
        {
            set.add(s.charAt(i));
        }
        res=set.size();

        return res;
    }
}
