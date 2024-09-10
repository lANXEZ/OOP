import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;

public class ControlPanel extends Panel{
	public ControlPanel() {
		setLayout(new GridLayout(1,3));
		AdjustPanel Ch = new AdjustPanel("Ch");
		JButton OnOff = new JButton("On/Off");
		AdjustPanel Vol = new AdjustPanel("Vol");
		add(Ch);
		add(Vol);
		add(OnOff);
		
	}

}
