package Movable;

public class MovableCircle extends Shapes.Circle implements Movable {
    private MovablePoint center;

    public MovableCircle() { center = new MovablePoint(); }

    public MovableCircle(double x, double y) { center = new MovablePoint(x, y); }

    public MovableCircle(double x, double y, double xSpeed, double ySpeed, double radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public MovablePoint getCenter() { return center; }

    @Override
    public String toString() {
        return "MovableCircle: radius = " + radius + ", center = " + center;
    }

    @Override
    public void moveUp() { center.moveUp(); }

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public void moveLeft() { center.moveLeft(); }
}