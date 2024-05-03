import java.util.ArrayList;
import java.util.List;

public class DivideString
{

    public static void main(String[] args) {
        DivideString divideString = new DivideString();
        String [] res =divideString.divideString("abcdefghi",3,'x');

        for (String r: res)
        {
            System.out.println(r);
        }

    }
    public String[] divideString(String s, int k, char fill) {

        int countk=0;
        List<String>li = new ArrayList<>();
        String temp="";
        for (int i=0; i<s.length(); i++)
        {
            countk++;
            temp+=s.charAt(i);
                if(countk==k)
                 {
                     if(temp.length()==k) {
                         li.add(temp);
                         countk = 0;
                         temp = "";
                     }
                }
                else
                {
                    if(i==s.length()-1 && temp.length()<k)
                    {
                        int calc=k-temp.length();

                        for(int j=0; j<calc; j++)
                        {
                            temp+=fill;
                        }
                        li.add(temp);
                    }
                }




        }

        System.out.println(li);

        String [] res=li.toArray(new String[0]);
        return res;
    }
}
