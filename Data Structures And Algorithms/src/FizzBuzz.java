import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));
    }
    public List<String> fizzBuzz(int n) {

        List<String>collectVariables = new ArrayList<>();

        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                collectVariables.add("FizzBuzz");
            }
            else if (i%5==0)
            {
                collectVariables.add("Buzz");
            }
            else if (i%3==0)
            {
                collectVariables.add("Fizz");
            }
            else
            {
                collectVariables.add(""+i);
            }
        }

        return collectVariables;
    }
}
