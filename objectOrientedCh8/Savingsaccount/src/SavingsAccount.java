public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance = savingsBalance + monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0){
            annualInterestRate = newRate;
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        if (savingsBalance >= 0) {
            this.savingsBalance = savingsBalance;
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "savingsBalance=" + savingsBalance +
                '}';
    }
}