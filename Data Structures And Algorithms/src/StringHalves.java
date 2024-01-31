import java.util.HashSet;
import java.util.Set;

public class StringHalves {
    public static void main(String[] args) {

        StringHalves stringHalves = new StringHalves();
        System.out.println(stringHalves.halvesAreAlike("book"));
       
    }
    public boolean halvesAreAlike(String s) {

        boolean res=false;
        int counter1=0;
        int counter2=0;
        Set<Character> hashset = new HashSet<>();
        hashset.add('a');
        hashset.add('e');
        hashset.add('i');
        hashset.add('o');
        hashset.add('u');
        hashset.add('A');
        hashset.add('E');
        hashset.add('I');
        hashset.add('O');
        hashset.add('U');

        int halves = s.length()/2;

        for(int i=0; i<halves; i++)
        {

           if(hashset.contains(s.charAt(i)))
           {
               counter1++;
           }
        }
        for(int i=halves; i<s.length(); i++)
        {
            if(hashset.contains(s.charAt(i)))
            {
                counter2++;
            }
        }
        if(counter1==counter2)
        {
            res=true;
        }

        return res;
    }
}
