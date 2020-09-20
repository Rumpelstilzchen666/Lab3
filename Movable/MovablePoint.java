package Movable;

public class MovablePoint implements Movable {
    private double x = 0, y = 0, xSpeed = 0, ySpeed = 0;

    MovablePoint() { }

    MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() { return xSpeed; }
    public void setXSpeed(double xSpeed) { this.xSpeed = xSpeed; }

    public double getYSpeed() { return ySpeed; }
    public void setYSpeed(double ySpeed) { this.ySpeed = ySpeed; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return "MovablePoint: x = " + x + ", y = " + y + ", xSpeed = " +
                xSpeed + ", ySpeed = " + ySpeed;
    }

    @Override
    public void moveUp() {
        xSpeed++;
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        xSpeed--;
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public void moveRight() {
        ySpeed++;
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        ySpeed--;
        x += xSpeed;
        y += ySpeed;
    }
}