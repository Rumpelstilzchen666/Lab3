package Movable;

public class MovablePoint implements Movable {
    private int x = 0, y = 0, xSpeed = 0, ySpeed = 0;

    MovablePoint() { }

    MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

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