import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome the Employee System ");
        String procedures = " Procedures...\n"
                           + "1. Developer..\n "
                           + "2. Manager..\n"
                           + " Type q for exit";
        System.out.println("*********************");
        System.out.println(procedures);
        System.out.println("**********************");

        while (true){
            System.out.println(" Chose the procedures..");
            String procedure = scanner.nextLine();

            if (procedure.equals("q")){
                System.out.println("exiting the program");
                break;

            } else if (procedure.equals("1")) {
                Developer developer = new Developer("Rukiye", "Sahin", 123, "Java, C++. C#, python");
                String d_procedures = "1. Format\n"
                        + "2. Show Information"
                        + " q for exit";
                System.out.println("****************");
                System.out.println(d_procedures);
                System.out.println("****************");
                while (true) {
                    System.out.println(" Chose the procedures..");
                    String d_procedure = scanner.nextLine();

                    if (d_procedure.equals("q")) {
                        System.out.println("exiting the program");
                        break;
                    } else if (d_procedure.equals("1")) {
                        System.out.println("Write the Operating system..");
                        String operatingSystem = scanner.nextLine();
                        developer.format(operatingSystem);
                    } else if (d_procedure.equals("2")) {
                        developer.showInformation();
                    } else {
                        System.out.println("Invalid Typing");
                    }
                }
            } else if (procedure.equals("2")) {
                Manager manager = new Manager("Muhammet","Sahin",12345,5);
                System.out.println("Manager  ");
                manager.showInformation();

            }
            else{
                System.out.println("Invalid Procedure...");
            }
        }



    }
}