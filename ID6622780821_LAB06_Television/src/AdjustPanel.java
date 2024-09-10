import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AdjustPanel extends Panel{
	public AdjustPanel(String text) {
		setLayout(new BorderLayout());
		JButton less = new JButton("<<");
		JButton mid = new JButton(text);
		JButton more = new JButton(">>");
		
		add(less, BorderLayout.WEST);
		add(mid, BorderLayout.CENTER);
		add(more, BorderLayout.EAST);
	}

}
