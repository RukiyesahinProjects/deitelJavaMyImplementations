import java.util.Scanner;

public class SalesPerson {
    public static void main(String[] args) {
        double[][] sales = new double[4][5]; //[SalesPerson][product]
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales data(SalesPerson [1-4] product[5-9] amount). Enter -1 to finish");

        while(true){
            System.out.print("SalesPerson Number: ");
            int salesPerson = scanner.nextInt();
            if (salesPerson == -1)
                 break;

            System.out.print("Product Number: ");
            int product = scanner.nextInt();

            System.out.println("Sales Amount: ");
            double amount = scanner.nextDouble();

            if (salesPerson >=1 && salesPerson <=4 && product >=1 && product<=5){
                sales[salesPerson - 1][product - 1] += amount;
            }else {
                System.out.println("Invalid Input! Try again.");
            }
        }
        // Display header row
        System.out.printf("%15s", "SalesPerson");
        for (int i = 1; i <= 5; i++){
            System.out.printf("%12s", "Product" +i);
        }
        System.out.printf("%12s%n", "Total");

        //Display sales data rows and row totals
        for (int i = 0; i < 4; i++) {
            double rowTotal = 0;
            System.out.printf("%15s", "SalesPerson", + (i+1));
            for (int j = 0; j < 5; j++){
                System.out.printf("%12.2f", sales[i][j]);
                rowTotal +=sales[i][j];
            }
            System.out.printf("%12.2f%n", rowTotal);
        }
        // Display column totals
        System.out.printf("%15s", "Total");
        for (int j = 0; j < 5; j++) {
            double colTotal = 0;
            for (int i = 0; i < 4; i++) {
                colTotal += sales[i][j];
            }
            System.out.printf("%12.2f", colTotal);
        }
        System.out.println();
    }
}
