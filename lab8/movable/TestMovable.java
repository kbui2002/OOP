package lab8.movable;

public class TestMovable {
    public static void main(String[] args) {
		// Movable Point
		Movable m1 = new MovablePoint(5, 6, 10, 15);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);

	}
}
