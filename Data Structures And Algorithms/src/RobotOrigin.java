public class RobotOrigin {
    public static void main(String[] args) {

        RobotOrigin rb = new RobotOrigin();
        System.out.println(rb.judgeCircle("RLUURDDDLU"));
    }
    public boolean judgeCircle(String moves) {

        boolean res=false;

        int xaxis=0;
        int yaxis=0;
        for(int i=0; i<moves.length(); i++)
        {
            if(moves.charAt(i)=='U')
            {
                xaxis++;
            }
            else if (moves.charAt(i)=='D')
            {
                xaxis--;
            }
            else if (moves.charAt(i)=='R')
            {
                yaxis++;
            }
            else
            {
                yaxis--;
            }
        }
        if(xaxis==0 && yaxis==0)
        {
            res=true;
        }


        return res;
    }
}
