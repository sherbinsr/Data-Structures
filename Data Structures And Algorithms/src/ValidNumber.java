public class ValidNumber {
    public static void main(String[] args) {

        ValidNumber validNumber = new ValidNumber();
        System.out.println(validNumber.isNumber("2e0"));
    }
    public boolean isNumber(String s) {

        boolean res =true;

        String alaphbets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+-,";

        if(s.length()==1 && s.charAt(0)=='.' ||s.equals(".."))
        {
            return res=false;
        }

        for(int i=0; i<s.length(); i++)
        {
            for(int j=0; j<alaphbets.length(); j++)
            {
                if(s.charAt(i)==alaphbets.charAt(j))
                {
                    res =false;
                }
            }
        }

       return res;
    }
}
