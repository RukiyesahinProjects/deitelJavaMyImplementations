public class Question18 {
    public static void main(String[] args) {
        final int SIZE = 10;
        for (int row = 1; row <= SIZE ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            for (int space = row; space < SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("  ");

            for (int col = SIZE; col >= row ; col--) {
                System.out.print("*");
            }
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            System.out.print("  ");
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = SIZE; col >= row; col--) {
                System.out.print("*");
            }
            System.out.print("  ");
            for (int space = SIZE; space >row ; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
