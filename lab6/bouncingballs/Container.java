package lab6.bouncingballs;

public class Container {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Container(int x, int y, int width, int height) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		x2 = x1 + width;
		y2 = y1 + height;
	}

	public int getX() {
		return x1;
	}

	public int getY() {
		return y1;
	}

	public int getWidth() {
		return x2 - x1;
	}

	public int getHeight() {
		return y2 - y1;
	}

	public boolean collidesWith(Ball ball) {
		if ((ball.getX() - ball.getRadius() <= this.x1) || (ball.getX() - ball.getRadius() >= this.x2)) {
			ball.reflectHorizontal();
			return true;
		} else if ((ball.getY() - ball.getRadius() <= this.y1) || (ball.getY() - ball.getRadius() >= this.y2)) {
			ball.reflectVertical();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Container [(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
	}

}
