import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter the number to find the smallest number");
        int smallest = Integer.MAX_VALUE;

        while (true) {
            int number = scanner.nextInt();
            System.out.println(" Please press 0 for quit the code");
            if (number == 0) {
                break;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println(" The smallest number is: " + smallest);


    }
}
