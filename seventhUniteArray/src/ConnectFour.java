import java.util.Scanner;

public class ConnectFour {
    static final int ROWS = 6;
    static final int COLUMNS = 7;
    static char[][] board = new char[ROWS][COLUMNS];
    static char currentPlayer ='R'; // R for Red, Y for Yellow
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);




    }
    public static void initializeBoard(){
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = '.';
    }
    public static void printBoard(){
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.printf(board[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.printf("1 2 3 4 5 6 7");//column numbers
    }
    public static boolean dropDisc(int col){
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == '.'){
                board[i][col] = currentPlayer;
                return true;
            }
        }
        return false;//column is full
    }
    public static void switchPlayer(){
        currentPlayer = (currentPlayer == 'R') ? 'Y':'R';
    }
    public static boolean isBoardFull(){
        for (int i = 0; i < COLUMNS; i++) {
            if (board[0][i] == '.')
                return false;
        }
        return true;
    }
    public static boolean hasWon(){
        //Horizontal
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS -4; j++)
                if (board[i][j] == currentPlayer &&
                    board[i][j + 1] == currentPlayer &&
                    board[i][j + 2] == currentPlayer &&
                    board[i][j + 3] == currentPlayer)
                    return true;

        //Vertical
        for (int j = 0; j < COLUMNS; j++)
            for (int i = 0; i < ROWS - 4; i++)
                if (board[i][j] == currentPlayer &&
                    board[i + 1][j] == currentPlayer &&
                    board[i + 2][j] == currentPlayer &&
                    board[i + 3][j] == currentPlayer)
                    return true;

        //Diagonal(top-left to bottom-right)
        for (int i = 3; i < ROWS; i++)
            for (int j = 0; j <= COLUMNS -4; j++)
                if(board[i][j] == currentPlayer &&
                   board[i + 1][j + 1] == currentPlayer &&
                   board[i + 2][j + 2] == currentPlayer &&
                   board[i + 3][j + 3] == currentPlayer)
                    return true;


        return false;
    }
}
