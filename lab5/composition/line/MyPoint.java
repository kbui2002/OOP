package lab5.composition.line;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		x = 0;
		y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		int[] array = { x, y };
		return array;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}

	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double distance(MyPoint another) {
		int xDiff = this.x - another.getX();
		int yDiff = this.y - another.getY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}
}
