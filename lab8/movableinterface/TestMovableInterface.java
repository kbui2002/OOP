package lab8.movableinterface;

public class TestMovableInterface {
        public static void main(String[] args) {
                // Movable Point
                Movable m1 = new MovablePoint(5, 6, 10, 15);
                System.out.println(m1);
                m1.moveLeft();
                System.out.println(m1);

                // Movable Circle
                Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
                System.out.println(m2);
                m2.moveRight();
                System.out.println(m2);
        }
        
}
