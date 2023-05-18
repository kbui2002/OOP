package lab5.composition.line;

public class TestMyLine {
	public static void main(String[] args) {
		// Test program to test all contructors and public methods
		MyLine line1 = new MyLine(1, 2, 3, 4);
		System.out.println(line1);
		System.out.println(line1.getBegin());
		System.out.println(line1.getEnd());

		MyPoint begin = new MyPoint(5, 6);
		MyPoint end = new MyPoint(7, 8);
		line1.setBegin(begin);
		line1.setEnd(end);
		System.out.println(line1.getBegin());
		System.out.println(line1.getEnd());

		line1.setBeginInX(9);
		System.out.println(line1.getBeginInX());
		line1.setBeginInY(10);
		System.out.println(line1.getBeginInY());
		line1.setBeginInXY(11, 12);
		System.out.println(line1.getBeginInXY()[0]);
		System.out.println(line1.getBeginInXY()[1]);

		System.out.printf("%.2f%n", line1.getLength());
		System.out.printf("%.2f%n", line1.getGradient());
	}
}
