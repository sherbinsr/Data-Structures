public class FaultyKeyboard {


    public static void main(String[] args) {

        FaultyKeyboard faultyKeyboard = new FaultyKeyboard();
        System.out.println(faultyKeyboard.finalString("poiinter"));
    }
    public String finalString(String s) {

        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
                if(s.charAt(i)=='i')
                {
                    res =res.reverse();
                }

                else
                {
                    res.append(s.charAt(i));
                }
        }

        return res.toString();
    }


}
