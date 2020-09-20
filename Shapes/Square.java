package Shapes;

public class Square extends Rectangle {
    public Square() {
        width = 1.0;
        length = 1.0;
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() { return width; }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side = " + width + ", color = " + color +
                (filled ? ", filled" : '\0');
    }
}