import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestDigit
{
    public static void main(String[] args) {

        SecondLargestDigit largestDigit = new SecondLargestDigit();
        System.out.println(largestDigit.secondHighest("dfa12321afdf"));
    }
    public int secondHighest(String s)
    {
            HashSet<Integer>hashSet = new HashSet<>();

            for(char c:s.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    hashSet.add(c-'0');
                }
            }
            int[] arr=new int[hashSet.size()];

            int j=0;
            for(int setValue:hashSet)
            {
                arr[j]=setValue;
                j++;
            }
            Arrays.sort(arr);
            if(arr.length<2)
            {
                return -1;
            }
            else
            {
                return arr[arr.length-2];
            }
    }
}
