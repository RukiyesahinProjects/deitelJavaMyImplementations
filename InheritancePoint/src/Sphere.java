import java.util.Random;

public class Sphere extends ThreeDimensionalShape{
    private double radius;

    public Sphere(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4/3) * Math.PI * radius * radius * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Sphere with radius %.2f", radius);
    }
}
