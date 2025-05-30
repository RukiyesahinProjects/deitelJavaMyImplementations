// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
MathRukiye mathRukiye = new MathRukiye();
        mathRukiye.sum(5, 10);
       // MathRukiye.sum(5, 10);
        MathRukiye.max(3,6,7);
        MathRukiye.min(3,6,7);
        Math.max(3, 6);
        String s = "";
        s = MathRukiye.randomString(10, 20);
        System.out.println(s);
        System.out.println(MathRukiye.randomString(10, 20));
        System.out.println(MathRukiye.RollDice(1,6));

    }
}