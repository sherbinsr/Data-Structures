public class SubstringWord
{
    public static void main(String[] args) {

        String[] patterns = {"a","b","c"};
        SubstringWord word = new SubstringWord();
        System.out.println(word.numOfStrings(patterns,"aaaaabbbbb"));
    }
    public int numOfStrings(String[] patterns, String word) {

        int count=0;
        for(int i=0; i<patterns.length; i++)
        {
            if(word.contains(patterns[i]))
            {
                count++;
            }
        }

        return count;
    }
}
