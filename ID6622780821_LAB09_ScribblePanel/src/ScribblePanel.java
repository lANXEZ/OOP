import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener {
	int x;
	int y;
	int r = 20;

	public ScribblePanel() {
		// TODO Auto-generated constructor stub
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		setFocusable(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

		Graphics g = getGraphics();
		if(e.getButton()+1 == MouseEvent.BUTTON1) {
			System.out.println("y");
			g.setColor(Color.black);
			g.drawLine(x, y, e.getX(), e.getY());
			x = e.getX();
			y = e.getY();
			
		}
		else{
			System.out.println("n");
			g.setColor(getBackground());
			g.fillOval(getX()-r, getY()-r, 2*r, 2*r);
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Scribble Panel");
		ScribblePanel panel = new ScribblePanel();

		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

