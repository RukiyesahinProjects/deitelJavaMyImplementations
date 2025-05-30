import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] salaryRanges = new int[9];

        while (true){
            System.out.println("Enter salesPerson's gross sales or -1 to end");
            double grossSales = scanner.nextDouble();
            if (grossSales == -1)
                break;

            int salary = (int)(200 + 0.09 * grossSales);

            int index;
            if (salary >= 1000)
                index = 8;
            else
                index = (salary - 200)/100;
            salaryRanges[index]++;
        }
        System.out.println("\nSalary ranges: ");
        String[] labels = {"$200-299","$300-399","$400-499","$500-599","6$00-699",
                            "$700-799","$800-899","$900-999","$1000 and over"};

        for (int i = 0; i < salaryRanges.length; i++) {
            System.out.printf("%s: %d\n", labels[i], salaryRanges[i]);

        }
    }
}
