public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(10000, "John Doe", "123456789");
        Account account2 = new Account(20000, "Jane Doe", "987654321");
        System.out.println("Account1 Name: "+ account1.getName()+"\nAccount1 balance: "+account1.getBanance()+"\nAccount1 account number: "+account1.getAccountNumber());
        System.out.println("Account2 Name: "+ account2.getName()+"\nAccount2 balance: "+account2.getBanance()+"\nAccount2 account number: "+account2.getAccountNumber());
    }
}
