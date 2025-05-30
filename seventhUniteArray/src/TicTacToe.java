import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    static char currentPlayer = 'X';
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();

        while (!gameEnded){
            System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] and column[1-3]):");
            int row = scanner.nextInt() -1;
            int col = scanner.nextInt() -1;

            if (isValidMove(row,col)){
                board[row][col] = currentPlayer;
                printBoard();

                if (hasWon(currentPlayer)){
                    System.out.println("Player " + currentPlayer + "wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    System.out.println("The game is a tie!");
                    gameEnded = true;
                }else {
                    switchPlayer();
                }
            }else {
                System.out.println("Invalid move! Try again.");
            }
        }

    }

    private static void printBoard() {
        System.out.println("-----------------");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j]+ " | ");
            }
            System.out.println("\n-------------");
        }
    }
    public static boolean isValidMove(int row, int col){
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ';
    }
    public static boolean isBoardFull(){
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
    public static boolean hasWon(char player){
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) ;
            return true;
        }


        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);

    }
    public static void switchPlayer(){
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
