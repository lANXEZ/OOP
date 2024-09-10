import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextField;

public class BarPanel extends Panel{
	public BarPanel() {
		TextField BarTF = new TextField("Ch 35 Vol 45");
		ControlPanel BarCP = new ControlPanel();
		setLayout(new BorderLayout());
		add(BarTF, BorderLayout.WEST);
		add(BarCP, BorderLayout.CENTER);
		
	}

}
