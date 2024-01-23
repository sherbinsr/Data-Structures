public class DefagingIP {
    public static void main(String[] args) {

        DefagingIP defagingIP = new DefagingIP();
        System.out.println(defagingIP.defangIPaddr("1.1.1.1"));
    }
    public String defangIPaddr(String address) {

        String res="";

        for (int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.')
            {
              res+="[.]";
            }
            else
            {
                res+=address.charAt(i);
            }
        }

        return res;

    }
}
