public abstract class TwoDimensinalShape extends Point{
    public TwoDimensinalShape(int x, int y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        return getX() * getY();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
