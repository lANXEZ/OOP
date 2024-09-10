import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;

public class KeyboardGame extends JPanel implements KeyListener, ActionListener{
	Timer timer = new Timer(1000, this);
	int score = 0;
	char displayChar = 'A';
	char responce = '?';
	Font myFont = new Font(Font.SANS_SERIF, Font.BOLD, 35);
	int xloc = 75;
	int yloc = 75;
	int lineSpace = 75;
	
	public KeyboardGame() {
		setFocusable(true);
		addKeyListener(this);
		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		g.setFont(myFont);
		super.paintComponent(g);
		displayChar = getRandomChar();
		g.drawString("Letter: "+ displayChar, xloc, yloc);
		g.drawString("You Typed", xloc, yloc+lineSpace);
		g.setColor(Color.BLUE);
		g.drawString(""+responce, xloc+300, yloc+lineSpace);
		g.setColor(Color.BLACK);
		g.drawString("Your Score = "+ score, xloc, yloc+(lineSpace*2));
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		responce = e.getKeyChar();
		if(responce == displayChar) {
			score ++;
		}
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
	public char getRandomChar() {
		Random random = new Random();
		return(char)(65+random.nextInt(26));
		
	}

}
