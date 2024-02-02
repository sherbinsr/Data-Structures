public class ShuffleString {


    public static void main(String[] args) {

        int[] indices ={4,5,6,7,0,1,2,3};
        ShuffleString string = new ShuffleString();
        System.out.println(string.restoreString("codeleet",indices));

    }

    public String restoreString(String s, int[] indices) {

        String res="";

       for(int i=0; i<indices.length; i++)
       {
           res+=s.charAt(indices[i]);
       }


        return res;
    }

}

