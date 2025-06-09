// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Point[] points = new Point[3];
     points[0] =new Circle(0,0,3);
     points[1] = new Square(0,0,4.5);
     points[2] = new Sphere(0,0,2);
     for (Point point : points){
         System.out.println(points.toString());
         System.out.println(point.getArea());

         if (point instanceof ThreeDimensionalShape){
             double volume = ((ThreeDimensionalShape) point).getVolume();
             System.out.println(volume);
         }
         System.out.println();
     }


    }
}