public class VowelStringAtHalve {

    public static void main(String[] args) {

        VowelStringAtHalve vw = new VowelStringAtHalve();
        boolean res=vw.halvesAreAlike("textbook");

        System.out.println(res);
    }
    public boolean halvesAreAlike(String s)
    {
        int strlen=s.length();

        int halfstrlen =strlen/2;

        int counter1=0,counter2=0;

        String vowels[]={"a","e","i","o","u","A", "E", "I", "O", "U"};

        String str = s.substring(0,halfstrlen);
        String str2 = s.substring(halfstrlen,strlen);

        for(String strings: vowels)
        {
            if(str.contains(strings))
            {
                counter1++;
            }
            if(str2.contains(strings))
            {
                counter2++;
            }
        }

        System.out.println(counter2+","+counter1);
       if(counter1==counter2)
       {
           return true;
       }
       else
       {
           return false;
       }

    }


}
