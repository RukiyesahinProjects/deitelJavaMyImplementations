import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int wins = 0;
        int losses = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Game start " +i);
            int dice1 = rollDice(rand);
            int dice2 = rollDice(rand);
            int sum = dice1 + dice2;
            System.out.println(" Roll dice!" +dice1 + " + " + dice2 + " = " + sum );

            if (sum == 7 || sum == 11) {
                System.out.println(" You win \n");
                wins++;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println(" You loss \n");
                losses++;
            }else {
                int point = sum;
                System.out.println("Point is: "+ point);

                while (true){
                    dice1 = rollDice(rand);
                    dice2 = rollDice(rand);
                    sum = dice1 + dice2;
                    System.out.println(" Roll dice!" +dice1 + " + " + dice2 + " = " + sum);

                    if (sum == point) {
                        System.out.println("You win! \n");
                        wins++;
                        break;
                    } else if (sum == 7) {
                        System.out.println(" You loss! \n");
                        losses++;
                        break;
                    }
                }
            }
        }
        System.out.println(" Game over!");
        System.out.println("Wins: " + wins );
        System.out.println("Losses: " + losses);


    }
    public static int rollDice(Random rand){
        return rand.nextInt(6) + 1;
    }
}