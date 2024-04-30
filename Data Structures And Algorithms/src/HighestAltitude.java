public class HighestAltitude
{

    public static void main(String[] args) {

        int [] gain ={-5,1,5,0,-7};
        HighestAltitude highestAltitude = new HighestAltitude();
        System.out.println(highestAltitude.largestAltitude(gain));
    }
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int altitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            System.out.println(altitude);

            if (altitude > highestAltitude)
                highestAltitude = altitude;
        }

        return highestAltitude;
    }
}
