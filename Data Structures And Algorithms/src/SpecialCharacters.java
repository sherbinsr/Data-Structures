import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SpecialCharacters
{

    public static void main(String[] args) {
        SpecialCharacters specialCharacters = new SpecialCharacters();
        System.out.println(specialCharacters.numberOfSpecialChars("aaAbcBC"));
    }
    public int numberOfSpecialChars(String word) {

        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) hs.add(word.charAt(i));
        }
        for(int i=0;i<word.length();i++){
            if(hs.contains((char)(word.charAt(i)-32))) {
                hs.remove((char)(word.charAt(i)-32));
                ans++;
            }

        }
        return ans;
    }
}
