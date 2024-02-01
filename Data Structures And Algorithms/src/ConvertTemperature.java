public class ConvertTemperature {

    public static void main(String[] args) {

        ConvertTemperature convertTemperature = new ConvertTemperature();
        double [] res= convertTemperature.convertTemperature(36.50);
        for(int i=0; i<res.length; i++)
        {
            System.out.println(res[i]);
        }
    }
    public double[] convertTemperature(double celsius) {

        double [] coverttemp = new double[2];

        coverttemp[0] =celsius+273.15;
        coverttemp[1]=celsius*1.80+32.00;

        return coverttemp;
    }
}
