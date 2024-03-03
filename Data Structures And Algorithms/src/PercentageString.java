public class PercentageString
{
    public static void main(String[] args) {

        PercentageString percentageString = new PercentageString();
        System.out.println(percentageString.percentageLetter("foobar",'o'));
    }
    public int percentageLetter(String s, char letter) {


        int total=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==letter)
            {
                total++;
            }
        }
        return  total*100/s.length();
    }
}
