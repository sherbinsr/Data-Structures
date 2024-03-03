public class FirstAppearTwice
{
    public static void main(String[] args) {

        FirstAppearTwice twice = new FirstAppearTwice();
        System.out.println(twice.repeatedCharacter("abcdd"));
    }
    public char repeatedCharacter(String s) {

        char a=' ';
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                a=s.charAt(i);
                break;

            }
        }
        return a;
    }
}
