public class HomeWork
{

    public static void main(String[] args) {

        int[]startTime={1,2,3};
        int[]endTime={3,2,7};
        HomeWork homeWork = new HomeWork();
        System.out.println(homeWork.busyStudent(startTime,endTime,4));
    }
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count=0;
        for(int i=0; i<startTime.length; i++)
        {
            int start=startTime[i];
            int end=endTime[i];
            for(int j=start; j<=end; j++)
            {
                if(j==queryTime)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
