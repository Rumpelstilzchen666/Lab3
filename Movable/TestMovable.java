package Movable;

public class TestMovable {
    public static void main(String[] args) {
        MovableCircle mc1 = new MovableCircle(1, 1);
        System.out.println(mc1);
        mc1.moveDown();
        mc1.moveDown();
        System.out.println(mc1);

        MovableRectangle mr1 = new MovableRectangle(-1, -1, 1, 1, 3, -3);
        System.out.println(mr1);
        mr1.moveDown();
        System.out.println(mr1);
        mr1.moveDown();
        System.out.println(mr1);
    }
}
