import java.util.Scanner;

public class ATM {
    public void run(Hesap hesap){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome Bank of Rukiye");
        System.out.println("***********************");
        System.out.println("Enter User Name: ");
        System.out.println("***********************");
        int entry =3;
        while (true){
            if (login.login(hesap)){
                System.out.println("Login successfully ");
                break;
            }
            else {
                System.out.println("Login not successfully ");
                entry -= 1;
                System.out.println("remaining access rights " + entry);
            }
            if (entry == 0){
                System.out.println("remaining access rights are exhausted");

                return;
            }
        }
        System.out.println("****************");
        String transactions = "1.View Balance\n "
                            + " 2.Deposit Trasnsaction\n"
                            + "3.Withdraw Transaction\n"
                            + "4.Enter q to quit ";
        System.out.println(transactions);
        System.out.println("******************");

        while (true){
            System.out.println("Please chose Transaction");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")){
                break;
            }
            else if (transaction.equals("1")){
                System.out.println("Balance: " + hesap.getBalance());
            }
            else if(transaction.equals("2")){
                System.out.println("the amount you want to deposit");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.deposit(amount);
            } else if (transaction.equals("3")) {
                System.out.println("the amount you want to withdraw");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.withdraw(amount);
            }
            else {
                System.out.println("Invalid transaction ");
            }
        }
    }
}
