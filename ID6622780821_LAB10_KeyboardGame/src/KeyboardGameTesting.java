import javax.swing.JFrame;

public class KeyboardGameTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("KeyboardGame");
		frame.add(new KeyboardGame());
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
