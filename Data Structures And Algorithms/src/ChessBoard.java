import java.util.HashMap;

public class ChessBoard
{
    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();
        System.out.println(chessBoard.squareIsWhite("a1"));
    }
    public boolean squareIsWhite(String coordinates) {

        int x=coordinates.charAt(0)-'a';
        int y=coordinates.charAt(1)-'0';

        System.out.println(x+","+y);
        if(x % 2 !=0 && y % 2 != 0)
            return true;
        else if(x % 2 ==0 && y % 2 ==0 )
            return true;

        return false;

    }
}
