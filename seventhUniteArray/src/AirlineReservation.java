import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10];
        Scanner scanner = new Scanner(System.in);

        while (true){
            if (allSeatsFull(seats)){
                System.out.println("All seats are full. Next flight leaving in 3 hours");
                break;
            }
            System.out.println("Type 1 for first class or Type 2 for economy class");
            int select = scanner.nextInt();

            if (select == 1){
                if (!assignSeats(seats,0,4)){
                    System.out.println("First class is full.Would you like Economy Class.(Y/N)");
                    char reply = scanner.next().charAt(0);
                    if (reply == 'y' || reply == 'Y'){
                        if (!assignSeats(seats,5,9)){
                            System.out.println("Plain is full. Next flight leaving in 3 hours");
                            break;
                        }
                    }else {
                        System.out.println("Next flight leaving in 3 hours");
                        break;
                    }
                }

            }
            else if (select == 2){
                if (!assignSeats(seats,5,9)){
                    System.out.println("Economy class is full.would you like the First class? (Y/N)");
                    char reply = scanner.next().charAt(0);
                    if (reply == 'y' || reply == 'Y'){
                        if (!assignSeats(seats,0,4)){
                            System.out.println("Plain is full.Next flight leaving in 3 hours");
                            break;
                        }
                    }
                }
            }
            else {
                System.out.println("Invalid choice! Please Type 1 or 2");
                break;
            }
        }

    }public static boolean allSeatsFull(boolean[] seats){
        for (boolean seat : seats){
            if (!seat){
                return false;
            }
        }

        return true;
    }
    public static boolean assignSeats(boolean[] seats,int start, int end){
        for (int i = start; i <= end; i++){
            if (!seats[i]) {
                seats[i] = true;
                System.out.println("Seat Assign: " +(i + 1));
                return true;
            }
        }
        return false;
    }
}
