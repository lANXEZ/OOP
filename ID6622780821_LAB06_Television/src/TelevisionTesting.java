import java.awt.Frame;

import javax.swing.JFrame;

public class TelevisionTesting {

	public static void main(String[] args) {
		Television TV = new Television("My Television");
		TV.setSize(600, 400);
		TV.setVisible(true);
		TV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
