public class ScoreOfString
{

    public static void main(String[] args) {

        ScoreOfString scoreOfString = new ScoreOfString();
        System.out.println(scoreOfString.scoreOfString("hello"));

    }
    public int scoreOfString(String s) {

        int ans =0;

        for(int i=0; i<s.length()-1; i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            int ascci1=ch1;
            int ascci2=ch2;

            int res=ascci1-ascci2;

            ans+=Math.abs(res);

        }

        return ans;
    }
}
