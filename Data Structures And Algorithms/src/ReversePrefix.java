public class ReversePrefix {

    public static void main(String[] args) {

        ReversePrefix  reverseString = new  ReversePrefix ();
        System.out.println(reverseString.reversePrefix("abcd",'z'));

    }
    public String reversePrefix(String word, char ch) {

        String res="";
        int flag=0;
        for(int i=0; i<word.length(); i++)
        {
          if(word.charAt(i)==ch)
          {
              System.out.println(i);
              flag=1;
              for(int j=i; j>=0; j--){

                  res+=word.charAt(j);
              }
              for(int k=i+1; k<word.length(); k++)
              {
                  res+=word.charAt(k);
              }
              break;
          }
        }
        if(flag==0)
        {
            for(int i=0; i<word.length(); i++)
            {
                res+=word.charAt(i);
            }
        }

        return res;
    }
}
