public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return (this.length * this.width);
    }

    public double perimeter() {
        return (2 * (this.length + this.width));
    }

    public void resize(double factor) {
        if (factor > 0){
            length *= factor;
            width *= factor;
        }else {
            System.out.println("Factor must be positive number!");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
