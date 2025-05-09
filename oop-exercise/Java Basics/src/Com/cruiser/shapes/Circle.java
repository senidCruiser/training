package Com.cruiser.shapes;

public class Circle implements Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Shape: Circle%n%nProperties: %nRadius = %s", radius);
    }
}
