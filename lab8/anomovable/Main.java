package lab8.anomovable;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);   //upcasting
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        //Test Circle
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);      //upcasting
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        //Test Rectangle
        Movable m3 = new MovableRectangle(1, 2, 3, 4, 10, 20);      //upcasting
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
    }
}
