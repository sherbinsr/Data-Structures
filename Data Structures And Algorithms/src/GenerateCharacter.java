public class GenerateCharacter
{
    public static void main(String[] args) {

        GenerateCharacter generateCharacter = new GenerateCharacter();
        System.out.println(generateCharacter.generateTheString(4));
    }
    public String generateTheString(int n) {

        String res="";

        int stop=n;
        if(n%2==0)
        {
            stop=n-1;
            for(int i=0; i<stop; i++)
            {
                res+="p";
            }
            res+="z";
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                res+="p";
            }
        }


        return res;
    }
}
