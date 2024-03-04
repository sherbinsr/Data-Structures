import java.util.HashSet;
import java.util.Set;

public class FirstAppearTwice
{
    public static void main(String[] args) {

        FirstAppearTwice twice = new FirstAppearTwice();
        System.out.println(twice.repeatedCharacter("abcdd"));
    }
    public char repeatedCharacter(String s) {

        char a =' ';
        Set<Character>set = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            if(set.contains(s.charAt(i)))
            {
                a=s.charAt(i);
                break;
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        return a;
    }
}
