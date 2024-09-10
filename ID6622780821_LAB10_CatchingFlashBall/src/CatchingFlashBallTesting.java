import javax.swing.JFrame;

public class CatchingFlashBallTesting {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Catching FlashBall");
		frame.add(new CatchingFlashBall());
		frame.setLocationRelativeTo(null);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
