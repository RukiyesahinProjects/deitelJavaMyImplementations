public class Account {
    private double banance;
    private String name;
    private String accountNumber;

    public void setBanance(double banance) {
        this.banance = banance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBanance() {
        return banance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Account(double banance) {
        this.banance = banance;
    }

    public Account(double banance, String name, String accountNumber) {
        this.banance = banance;
        this.name = name;
        this.accountNumber = accountNumber;
    }
    public void deposite(double amount){
        if (amount > 0){
            banance = banance + amount;
        }
        else {
            System.out.println("You can not deposit negative amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= banance){
            banance = banance - amount;
        }
        else if(amount > banance){
            System.out.println("You can not withdraw more than your balance");
        }
        else {
            System.out.println("You can not withdraw negative amount");
        }
    }
}

