public class ParkingSystem {
    public static void main(String[] args) {

        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(1));

    }

    int b,m,s;
    public ParkingSystem(int big, int medium, int small) {

        b=big;
        m=medium;
        s=small;
    }

    public boolean addCar(int carType) {

        if(carType==1 && b==0 || carType==2 && m==0  || carType==3 && s==0 )
        {
            return false;
        }
        else if (carType==1) {

           b--;
        }
        else if (carType==2) {

          m--;
        }
        else if (carType==3){
            s--;
        }
        return true;
    }
}
