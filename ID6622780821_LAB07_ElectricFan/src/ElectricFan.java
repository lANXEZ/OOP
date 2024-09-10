import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ElectricFan extends JPanel implements ActionListener{
	Timer timer = new Timer(1, this);
	int turningArc = 0;
	ElectricFan() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(295, 95, 210, 210);
		
		g.setColor(Color.white);
		g.fillOval(300, 100, 200, 200);
		
		g.setColor(Color.yellow);
		g.fillArc(310, 110, 180, 180, 0+turningArc, 36);
		g.fillArc(310, 110, 180, 180,72+turningArc, 36);
		g.fillArc(310, 110, 180, 180, 144+turningArc, 36);
		g.fillArc(310, 110, 180, 180, 216+turningArc, 36);
		g.fillArc(310, 110, 180, 180, 288+turningArc, 36);
		
		g.setColor(Color.gray);
		g.fillRect(380, 300, 45, 150);
		
		g.setColor(Color.blue);
		int[] x = {350, 450, 500, 300};
		int[] y = {450, 450, 550, 550};
		g.fillPolygon(x, y, 4);
		
		g.setColor(Color.red);
		g.fillRoundRect(360, 500, 17, 20, 20, 20);
		g.fillRoundRect(380, 500, 17, 20, 20, 20);
		g.fillRoundRect(400, 500, 17, 20, 20, 20);
		g.fillRoundRect(420, 500, 17, 20, 20, 20);
		
		g.setColor(Color.white);
		g.drawString("0", 366, 514);
		g.drawString("1", 386, 514);
		g.drawString("2", 406, 514);
		g.drawString("3", 426, 514);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==timer) {
			turningArc+=3;
			repaint();
		}
		
	}

}
