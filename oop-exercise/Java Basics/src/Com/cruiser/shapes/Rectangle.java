package Com.cruiser.shapes;

public class Rectangle implements Shape {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return String.format("Shape: Rectangle%n%nProperties: %n width = %s%n length = %s",width, length);
    }
}
