package Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, downRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed,
            int ySpeed) {
        int tmp;
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
        topLeft = new MovablePoint(x1, y2, xSpeed, ySpeed);
        downRight = new MovablePoint(x2, y1, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle: \n\ttopLeft = " + topLeft +
                ";\n\tdownRight = " + downRight + '\n';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        downRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        downRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        downRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        downRight.moveLeft();
    }
}