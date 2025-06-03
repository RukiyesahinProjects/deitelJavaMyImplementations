// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SavingsAccount.modifyInterestRate(0.5);
       SavingsAccount s1 = new SavingsAccount(1000);

       s1.calculateMonthlyInterest();
       s1.getSavingsBalance();
        System.out.println(s1);
        s1.setSavingsBalance(2000);
        s1.calculateMonthlyInterest();
        System.out.println(s1);

        SavingsAccount.modifyInterestRate(2.0);
        SavingsAccount saveMoney = new SavingsAccount(10000);
        saveMoney.calculateMonthlyInterest();
        System.out.println("Total Money: " + saveMoney.getSavingsBalance());


    }
}