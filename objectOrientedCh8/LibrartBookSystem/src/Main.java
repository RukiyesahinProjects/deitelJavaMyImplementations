// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Kimsesizler","Ali");
        b1.checkOut();
        b1.status();
        System.out.println(b1);
        b1.returnBook();
        System.out.println(b1);
        b1.status();
        System.out.println(b1);
    }
}