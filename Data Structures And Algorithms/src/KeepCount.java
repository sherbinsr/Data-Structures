public class KeepCount {

    public static void main(String[] args) {

        int hours[]={0,1,2,3,4};
        KeepCount keepCount = new KeepCount();
        int res = keepCount.numberOfEmployeesWhoMetTarget(hours,2);
        System.out.println(res);
    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int keepCount=0;

        for(int i=0; i<hours.length; i++)
        {
            if(hours[i]>=target)
            {
                keepCount++;
            }
        }


        return keepCount;
    }

}
