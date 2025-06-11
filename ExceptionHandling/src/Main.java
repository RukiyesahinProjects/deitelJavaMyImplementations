import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void ageControl(int age){
        if (age < 18){
            throw  new InvalidAgeException("InvalidAge");
        }else {
            System.out.println("Welcome...");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your age: ");
        int age = scanner.nextInt();
        try {
            ageControl(age);
        }catch (InvalidAgeException e){
            e.printStackTrace();
        }


     }
}