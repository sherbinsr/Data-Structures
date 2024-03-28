public class BatteryPercentage {

    public static void main(String[] args) {
        int[] batteryPercentages ={1,1,2,1,3};
        BatteryPercentage batteryPercentage = new BatteryPercentage();
        System.out.println(batteryPercentage.countTestedDevices(batteryPercentages));
    }
    public int countTestedDevices(int[] batteryPercentages) {

        int count=0;

        for(int i=0; i< batteryPercentages.length; i++) {

          if(batteryPercentages[i]>count)
          {
              count++;
          }
        }
        return count;
    }
}
