public class SeniorCitizens
{
    public static void main(String[] args) {

        String [] details ={"7868190130M7522","5303914400F9211","9273338290F4010"};
        SeniorCitizens citizens = new SeniorCitizens();
        System.out.println(citizens.countSeniors(details));
    }
    public int countSeniors(String[] details) {

        int count=0;

        for(int i=0; i<details.length; i++)
        {
            String temp =details[i].substring(11,13);
            int compare=Integer.parseInt(temp);
            if(compare>60)
            {
                count++;
            }
        }

        return count;

    }
}
