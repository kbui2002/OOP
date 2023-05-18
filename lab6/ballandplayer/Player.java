package lab6.ballandplayer;

public class Player {
	private int number;
	private float x;
	private float y;
	private float z = 0.0f;

	public Player(int number, float x, float y) {
		this.number = number;
		this.x = x;
		this.y = y;
	}

	public void move(float xDisp, float yDisp) {
		this.x = xDisp;
		this.y = yDisp;
	}

	public void jump(float zDisp) {
		this.z = zDisp;
	}

	public boolean near(Ball ball) {
		float xDiff = (float) Math.pow(ball.getX() - x, 2);
		float yDiff = (float) Math.pow(ball.getY() - y, 2);
		return (Math.sqrt(xDiff + yDiff) < 8);
	}

	public void kick(Ball ball) {
		ball.setXYZ(ball.getX() + x, ball.getY() + y, ball.getZ() + z);
	}
}
