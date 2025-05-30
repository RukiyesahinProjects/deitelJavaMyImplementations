public class Question10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 10; i >= 1; i--){
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        int rows = 10;
        for (int i = 1; i <= rows; i++) {

            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            for (int star = rows; star >= i; star--) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <= rows ; i++) {
            for (int j =rows - i; j > 0; j--){
                System.out.print(" ");
            }
            for (int star = 1; star <= i ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
