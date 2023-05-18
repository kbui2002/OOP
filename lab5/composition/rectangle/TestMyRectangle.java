package lab5.composition.rectangle;

public class TestMyRectangle {
	public static void main(String[] args) {
		MyPoint top_left = new MyPoint(2, 10);
		MyPoint bottom_right = new MyPoint(9, 5);
		MyRectangle rectangle = new MyRectangle(top_left, bottom_right);
		System.out.println(rectangle);
		System.out.printf("%.2f%n", rectangle.getPerimeter());
		System.out.println(rectangle.getType());
	}
}
