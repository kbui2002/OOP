package lab6.ballandplayer;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball = new Ball(1, 2, 0);
		System.out.println(ball.toString());
		Player player = new Player(22, 2, 2);
		System.out.println(player.near(ball));
		player.kick(ball);
		System.out.println(ball);
	}

}
