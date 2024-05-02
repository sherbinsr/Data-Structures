import java.util.Arrays;

public class MeanOfArray
{

    public static void main(String[] args) {

        int arr []={6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        MeanOfArray meanOfArray = new MeanOfArray();
        System.out.println(meanOfArray.trimMean(arr));
    }
    public double trimMean(int[] arr) {

        double res=0;
        Arrays.sort(arr);
        double calcPercentage= (int) (arr.length*0.05);
        int sum=0;
        double j=0;
        for(int i=(int)calcPercentage; i<arr.length-calcPercentage; i++)
        {
            sum+=arr[i];
            j++;
        }
        res=sum/j;
        return res;

    }
}
