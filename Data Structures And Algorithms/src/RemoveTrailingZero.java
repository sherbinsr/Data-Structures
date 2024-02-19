public class RemoveTrailingZero {

    public static void main(String[] args) {

        RemoveTrailingZero trailingZero = new RemoveTrailingZero();
        System.out.println(trailingZero.removeTrailingZeros("51230100"));
    }
    public String removeTrailingZeros(String num) {

        String res="";
        int i=num.length()-1;
        for(; i>=0; i--)
        {
          if(num.charAt(i)!='0')
          {
              break;
          }
        }
        res=num.substring(0,i+1);

        return res;
    }
}
