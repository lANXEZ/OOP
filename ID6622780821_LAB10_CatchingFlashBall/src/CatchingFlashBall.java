import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CatchingFlashBall extends JPanel implements MouseListener {
	private int x;
	private int y;
	int r = 15;
	Timer timer = new Timer(1000, new TimerListener());

	public CatchingFlashBall() {
		// TODO Auto-generated constructor stub
		setFocusable(true);
		this.setBackground(Color.BLACK);
		timer.start();
		Random random = new Random();
		x = random.nextInt(600);
		y = random.nextInt(400);
		this.addMouseListener(this);
	}

	private class TimerListener implements ActionListener {

		public TimerListener() {

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// Update position randomly
			Random random = new Random();
			x = random.nextInt(getWidth());
			y = random.nextInt(getHeight());
			repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.orange);
		g.fillOval(x, y, 30, 30);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (Math.sqrt(Math.pow(e.getX() - x, 2) + Math.pow(e.getY() - y, 2)) <= r) {
			timer.stop();
		}

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
}
