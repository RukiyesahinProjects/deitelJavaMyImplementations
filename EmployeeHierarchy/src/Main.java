// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee[] employee = {
                new SalariedEmployee("Muhammet", "Sahin", "1234",2000),
                new HourlyEmployee("Salih","Sahin","12345", 20.5,41),
                new CommissionEmployee("Rukiye","Sahin","123456",5000,30),
                new BasePlusCommissionEmployee("Asude","Sahin","5678",3000,30,300)
        };
        for (Employee emp : employee) {
            System.out.println(emp);
            System.out.printf("Earnings: $%.2f%n%n", emp.earnings());
        }

    }
}