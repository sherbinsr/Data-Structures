public class RansomNotes {

    public static void main(String[] args) {

        RansomNotes ransomNotes= new RansomNotes();
        boolean res=  ransomNotes.canConstruct("fffbfg","effjfggbffjdgbjjhhdegh");
        System.out.println(res);
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result;
        char ch[] =magazine.toCharArray();
        String reverse ="";
        for(int i=magazine.length()-1; i>=0; i--)
        {
            reverse +=ch[i];
        }

        if(magazine.contains(ransomNote) || ransomNote.contains(reverse))
        {
            result=true;
        }

        else
        {
            result =false;
        }
        return result;
    }
}