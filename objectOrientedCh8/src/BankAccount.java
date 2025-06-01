import java.util.HashMap;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
        }
        else {
            System.out.println("You can not deposit negative amount");
        }
    }
    public void withdraw(double amount){
        if (balance > 0 && amount <= balance){
            balance -= amount;
            System.out.println("New balance: " + balance);
        }else if(amount > balance){
            System.out.println("You can not withdraw more than balance");
        }
    }
    public void transfer(BankAccount otherAccount, double amount){
        if (amount > 0 && amount <= balance){
            this.withdraw(amount);
            otherAccount.deposit(amount);
            System.out.println("Transfer is successfully" + otherAccount.balance);
        }else {
            System.out.println("Transfer failed, Try again");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
