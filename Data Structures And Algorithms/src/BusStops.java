public class BusStops
{
    public static void main(String[] args) {

        int [] distance={7,10,1,12,11,14,5,0};
        BusStops busStops = new BusStops();
        System.out.println(busStops.distanceBetweenBusStops(distance,7,2));
    }
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int stops=0;
        int total=0;
        for(int i=0; i<distance.length; i++)
        {
          if( start<destination && (i>=start && i<destination))
          {
              stops+=distance[i];
          }
          if( start>destination && (i>=start || i<destination))
          {
              stops+=distance[i];
          }
          total+=distance[i];
        }

      int  min=Math.min(stops,(total-stops));
        return min;

    }
}
