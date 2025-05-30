import java.util.Scanner;

public class Question13 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];
        int count = 0;

        while (count < 5){
            System.out.println(" Enter a number between 10 and 100: ");
            int num = scanner.nextInt();

            if (num < 10 || num > 100) {
                System.out.println(" Number must be between 10 and 100: ");
                continue;
            }
            boolean isDublicates = false;

            for (int i = 0; i < count; i++) {
                if(number[i] == num){
                    isDublicates = true;
                    break;
                }
            }
            if (!isDublicates){
                number[count] = num;
                count++;

                System.out.print("Number is: ");

                for (int i=0; i < count; i++){
                    System.out.println("Dublicate number. Not added");
                }
            }
        }
    }
}
