import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Television extends JFrame{
	JButton Screen = new JButton("");
	BarPanel BP = new BarPanel();
	public Television(String title) {
		super(title);
		setLayout(new BorderLayout());
		add(Screen, BorderLayout.CENTER);
		add(BP, BorderLayout.SOUTH);
	}

}
