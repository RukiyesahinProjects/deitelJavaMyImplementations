import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int productNumber;
        int quantity;
        System.out.println("Enter the product number (1-5) or 0 to finish:");
        productNumber = scanner.nextInt();

        while (productNumber != 0){
            System.out.println("Enter the quantity: ");
            quantity = scanner.nextInt();
            switch (productNumber){
                case 1:
                    total += quantity * 2.98;
                    break;
                case 2:
                    total += quantity * 4.50;
                    break;
                case 3:
                    total += quantity * 9.98;
                    break;
                case 4:
                    total += quantity * 4.49;
                    break;
                case 5:
                    total += quantity * 6.87;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                    break;
            }
        }
        System.out.printf("Total cost: $%.2f%n", total);
        System.out.println("Thank you for shopping with us!");
    }
}
