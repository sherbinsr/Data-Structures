public class OperatorsProblem {

    public static void main(String[] args) {

        String operations []={"--X","X++","X++"};
        OperatorsProblem operatorsProblem = new OperatorsProblem();
        int res = operatorsProblem.finalValueAfterOperations(operations);
        System.out.println(res);
    }
    public int finalValueAfterOperations(String[] operations) {

        int value=0;

        for(int i=0; i<operations.length; i++)
        {
            if(operations[i].contains("++"))
            {
                value++;
            }
            else
            {
                value--;
            }
        }
        return value;
    }
}
