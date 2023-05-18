package lab5.composition.circle;

public class TestMyCircle {
	public static void main(String[] args) {
		// Test program to test all contructors and public methods
		MyPoint center1 = new MyPoint();
		MyCircle circle1 = new MyCircle(center1, 1);
		System.out.println(circle1);
		System.out.println(circle1.getRadius());

		circle1.setRadius(2);
		System.out.println(circle1.getRadius());
		circle1.setCenterX(3);
		circle1.setCenterY(4);
		System.out.println(circle1.getCenter());
		System.out.println(circle1.getCenterX());
		System.out.println(circle1.getCenterY());

		circle1.setCenterXY(5, 6);
		System.out.println(circle1.getCenterXY()[0]);
		System.out.println(circle1.getCenterXY()[1]);

		System.out.printf("%.2f%n", circle1.getArea());
		System.out.printf("%.2f%n", circle1.getCircumference());
		MyPoint center2 = new MyPoint(8, 9);
		MyCircle another = new MyCircle(center2, 7);
		System.out.printf("%.2f%n", circle1.distance(another));
	}
}
