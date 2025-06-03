// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Rukiye","12345",2000);

        atm.run(hesap);
        System.out.println("exit");

    }
}