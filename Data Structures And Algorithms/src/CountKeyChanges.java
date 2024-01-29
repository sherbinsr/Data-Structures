public class CountKeyChanges {
    public static void main(String[] args) {

        CountKeyChanges countKeyChanges = new CountKeyChanges();
        System.out.println(countKeyChanges.countKeyChanges("AaAaAaaA"));
    }
    public int countKeyChanges(String s) {

        int count=0;


        for (int i=0; i<s.length()-1; i++)
        {
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i+1)))
               {
               continue;
               }
               else
               {
                   count++;
               }

            }

            return  count;
    }
}
