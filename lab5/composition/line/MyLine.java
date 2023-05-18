package lab5.composition.line;

public class MyLine {
	private MyPoint begin = new MyPoint();
	private MyPoint end = new MyPoint();

	public MyLine(int x1, int y1, int x2, int y2) {
		begin.setX(x1);
		begin.setY(y1);
		end.setX(x2);
		end.setY(y2);
	}

	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	public MyPoint getBegin() {
		return begin;
	}

	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	public MyPoint getEnd() {
		return end;
	}

	public void setEnd(MyPoint end) {
		this.end = end;
	}

	public int getBeginInX() {
		return begin.getX();
	}

	public void setBeginInX(int x) {
		begin.setX(x);
	}

	public int getBeginInY() {
		return begin.getY();
	}

	public void setBeginInY(int y) {
		begin.setY(y);
	}

	public int getEndInX() {
		return end.getX();
	}

	public void setEndInX(int x) {
		end.setX(x);
	}

	public int getEndInY() {
		return end.getY();
	}

	public void setEndInY(int y) {
		end.setY(y);
	}

	public int[] getBeginInXY() {
		return begin.getXY();
	}

	public void setBeginInXY(int x, int y) {
		begin.setXY(x, y);
	}

	public int[] getEndInXY() {
		return end.getXY();
	}

	public void setEndInXY(int x, int y) {
		end.setXY(x, y);
	}

	public double getLength() {
		return begin.distance(end);
	}

	public double getGradient() {
		double xDiff = end.getX() - begin.getX();
		double yDiff = end.getY() - begin.getY();
		return Math.atan2(xDiff, yDiff);
	}

	public String toString() {
		return "MyLine[begin = (" + begin.getX() + ", " + begin.getY() + "), end =(" + end.getX() + ", " + end.getY()
				+ ")]";
	}
}
