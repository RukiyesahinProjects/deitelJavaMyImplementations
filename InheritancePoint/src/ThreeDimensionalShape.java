public abstract class ThreeDimensionalShape extends Point {
    public ThreeDimensionalShape(int x, int y) {
        super(x, y);
    }
    public abstract double getVolume();

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
