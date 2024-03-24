import java.util.Arrays;

public class MaxIceCream
{

    public static void main(String[] args) {

        int[] costs={1,3,2,4,1};
        MaxIceCream max = new MaxIceCream();
        System.out.println(max.maxIceCream(costs,7));
    }

    public int maxIceCream(int[] costs, int coins) {

        int res=0;

        int count=0;
        Arrays.sort(costs);


        for(int i=0; i< costs.length; i++)
        {
            res+=costs[i];
            if(res<=coins)
            {
                count++;
            }
            else
            {
                break;
            }
        }


        return count;
    }
}
