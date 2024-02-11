import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {

        int[] candies ={12,1,12};
        GreatestCandies greatestCandies = new GreatestCandies();
        System.out.println(greatestCandies.kidsWithCandies(candies,10));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int highest=0;
        for(int candy:candies)
        {
            highest =Math.max(candy,highest);
        }
        List<Boolean>bool= new ArrayList<>();

        for(int i=0; i<candies.length; i++)
        {
            int kids=i+1;

            int calc = candies[i]+extraCandies;

           if(calc>=highest)
           {
               bool.add(true);
           }
           else
           {
               bool.add(false);
           }
        }

        return bool;

    }
}
