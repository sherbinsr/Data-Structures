import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {

        int [] heights = {5,1,2,3,4};
        HeightChecker heightChecker = new HeightChecker();
        System.out.println(heightChecker.heightChecker(heights));

    }

    public int heightChecker(int[] heights) {

        int count=0;

        int copy[]=new int[heights.length];

        for(int i=0; i<heights.length; i++)
        {
            copy[i]=heights[i];
        }
        Arrays.sort(copy);

        for(int j=0; j<heights.length; j++)
        {
           if(heights[j]!=copy[j])
           {
               count++;
           }
        }

        return  count;
    }
}
