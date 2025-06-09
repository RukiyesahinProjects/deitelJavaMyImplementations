// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
          shapes[0] = new Circle(3.0);
          shapes[1] = new Square(4.5);
          shapes[2] = new Sphere(2.0);
        for (Shape shape : shapes){
            System.out.println(shape.toString());
            System.out.println(shape.getArea());

            if (shape instanceof ThreeDimensionalShape){
                double volume = ((ThreeDimensionalShape)shape).getVolume();
                System.out.println(volume);
            }
            System.out.println();
        }
    }
}