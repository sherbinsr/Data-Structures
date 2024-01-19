public class DivisorGame {

    public static void main(String[] args) {

        DivisorGame divisorGame = new DivisorGame();
        System.out.println(divisorGame.divisorGame(3));

    }
    public boolean divisorGame(int n) {

        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
