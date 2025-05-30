public class Question7 {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;

        }
        System.out.printf("The product of the first 15 odd numbers is: %d%n", product);
    }
}
