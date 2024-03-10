import java.util.ArrayList;
import java.util.List;

public class StringToInt
{

    public static void main(String[] args) {

        StringToInt stringToInt = new StringToInt();
        System.out.println(stringToInt.myAtoi("            -42"));
    }

    public int myAtoi(String s) {

        String temp="";

        List<Character>li=new ArrayList<>();
        li.add('9');
        li.add('1');
        li.add('2');
        li.add('3');
        li.add('4');
        li.add('5');
        li.add('6');
        li.add('7');
        li.add('8');
        li.add('9');
        li.add('-');
        for(int i=0; i<s.length(); i++){
            if(li.contains(s.charAt(i)))
            {
                temp+=s.charAt(i);
            }
        }

        int res =Integer.parseInt(temp);

        return res;
    }
}
