package Movable;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovableCircle(3, 3, 0, -2, 7);
        m1.moveDown();
        m1.moveDown();
        System.out.println(m1);

        m1 = new MovableRectangle(1, 1, -1, -1, 0, 0);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
    }
}
