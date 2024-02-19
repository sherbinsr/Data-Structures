public class ObtainZero {
    public static void main(String[] args) {

        ObtainZero obtainZero =new ObtainZero();
        System.out.println(obtainZero.countOperations(10,10));


    }
    public int countOperations(int num1, int num2) {

        int res=0;
        while (num2!=0 && num1!=0){
            res++;
            if (num2 > num1) {
                num2 = num2 - num1;
            } else {
                num1 = num1 - num2;
            }
        }
        return res;
    }
}
