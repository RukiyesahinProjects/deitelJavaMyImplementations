// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Rectangle r1 = new Rectangle(10,5);
      double newArea = r1.area();

        System.out.println("Rectangle area: " + newArea);
        double newPremeter = r1.perimeter();
        System.out.println("Rectangle perimeter: " + newPremeter);
      r1.resize(3);
        System.out.println(r1);

    }
}