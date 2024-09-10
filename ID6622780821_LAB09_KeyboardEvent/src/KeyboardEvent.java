import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyboardEvent extends JPanel implements KeyListener {
	String str = "";
	char key;

	public KeyboardEvent() {
		super();
		this.addKeyListener(this);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
		g.setColor(Color.BLUE);
		g.drawString(str, 0, 100);
	}

	public boolean isFocusTraversable() {
		return true;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		key = e.getKeyChar();
		str += key;
		repaint();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Keyboard Event");
		KeyboardEvent event = new KeyboardEvent();
		frame.add(event);
		
		frame.setSize(800, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
