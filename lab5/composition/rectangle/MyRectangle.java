package lab5.composition.rectangle;

public class MyRectangle {
	private MyPoint top_left;
	private MyPoint bottom_right;

	public MyRectangle(int x1, int y1, int x2, int y2) {
		top_left.setXY(x1, y1);
		bottom_right.setXY(x2, y2);
	}

	public MyRectangle(MyPoint top_left, MyPoint bottom_right) {
		this.top_left = top_left;
		this.bottom_right = bottom_right;
	}

	public String toString() {
		return "MyRectangle[top_left = " + top_left.toString() + ", bottom_right = " + bottom_right.toString() + "]";
	}

	public double getPerimeter() {
		return 2 * (bottom_right.getX() - top_left.getX() + top_left.getY() - bottom_right.getY());
	}

	public String getType() {
		if (bottom_right.getX() - top_left.getX() == top_left.getY() - bottom_right.getY()) {
			return "Square";
		}
		return "Rectangle";
	}
}
