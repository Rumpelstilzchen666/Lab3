package Movable;

public class MovableRectangle extends Shapes.Rectangle implements Movable {
    private MovablePoint topLeft;

    public MovableRectangle(double x1, double y1, double x2, double y2,
            double xSpeed, double ySpeed) {
        double tmp;
        if (x1 < x2) {
            tmp = x1;
            x1 = x2;
            x2 = tmp;
        }
        if (y1 < y2) {
            tmp = y1;
            y1 = y2;
            y2 = tmp;
        }
        length = x1 - x2;
        width = y1 - y2;
        topLeft = new MovablePoint(x1, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() { topLeft.moveUp(); }

    @Override
    public void moveDown() { topLeft.moveDown(); }

    @Override
    public void moveRight() { topLeft.moveRight(); }

    @Override
    public void moveLeft() { topLeft.moveLeft(); }

    @Override
    public String toString() {
        return "MovableRectangle: length = " + length + ", width = " + width +
                ", topLeft = " + topLeft;
    }
}