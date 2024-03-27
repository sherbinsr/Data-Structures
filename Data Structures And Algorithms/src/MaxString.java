public class MaxString
{
    public static void main(String[] args) {

        String[] words ={"cd","ac","dc","ca","zz"};
        MaxString max = new MaxString();
        System.out.println(max.maximumNumberOfStringPairs(words));
    }
    public int maximumNumberOfStringPairs(String[] words) {

        int count=0;
        for(int i=0; i<words.length; i++)
        {
            for (int j=i+1; j< words.length; j++)
            {
                String reverse=reverse(words[j]);

                if(words[i].equals(reverse))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public  String reverse(String rev)
    {
        String res="";
        for(int i=rev.length()-1; i>=0; i--)
        {
            res+=rev.charAt(i);
        }

        return res;
    }
}
