public class GoalParser
{
    public static void main(String[] args) {

        GoalParser goalParser = new GoalParser();
        System.out.println(goalParser.interpret("G()(al)"));
    }
    public String interpret(String command) {

        String res="";

        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i)=='G'){

                res+="G";
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                res += "o";

            } else if (command.charAt(i)=='a') {
                res+="al";
            }
        }

        return res;
    }
}
