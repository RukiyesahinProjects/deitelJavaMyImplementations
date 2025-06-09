public class Square extends TwoDimensinalShape{
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Square with side %.2f", side);
    }
}
