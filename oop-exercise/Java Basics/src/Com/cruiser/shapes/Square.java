package Com.cruiser.shapes;

public class Square extends Rectangle { // Square is a Special rectangle
    public Square(double length) {
        super(length, length);
    }

    @Override
    public String toString() {
        return String.format("Shape: Square%n%nProperties: %nSide Length = %s", getLength());
    }
}
