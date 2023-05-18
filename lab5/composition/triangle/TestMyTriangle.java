package lab5.composition.triangle;

public class TestMyTriangle {
	public static void main(String[] args) {
		MyPoint v1 = new MyPoint(1, 2);
		MyPoint v2 = new MyPoint(3, 4);
		MyPoint v3 = new MyPoint(5, 6);
		MyTriangle triangle = new MyTriangle(v1, v2, v3);
		System.out.println(triangle);
		System.out.printf("%.2f%n", triangle.getPerimeter());
		System.out.println(triangle.getType());
	}
}
