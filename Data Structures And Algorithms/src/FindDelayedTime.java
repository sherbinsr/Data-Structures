public class FindDelayedTime {

    public static void main(String[] args) {

        FindDelayedTime findDelayedTime= new FindDelayedTime();
        System.out.println(findDelayedTime.findDelayedArrivalTime(23,5));


    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        int res=0;

        int calctime=arrivalTime+delayedTime;

        if(calctime==24)
        {
            return  res;
        }
        else if (calctime<24)
        {
          return calctime;
        } else
        {
            return calctime-24;
        }
    }
}
