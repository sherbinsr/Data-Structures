public class MaxiumAcheiveNum {
    public static void main(String[] args) {

        MaxiumAcheiveNum maxiumAcheiveNum= new MaxiumAcheiveNum();
        System.out.println(maxiumAcheiveNum.theMaximumAchievableX(4,1));
    }
    public int theMaximumAchievableX(int num, int t) {

        int add=0;

        add =num+t+t;

        return add;
    }
}
