import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class MovingMassagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener {
	JPanel massagePanel = new JPanel();
	JPanel colorPanel = new JPanel();
	JPanel directionPanel = new JPanel();
	JRadioButton mouseBt = new JRadioButton("Use mouse");

	JLabel displayMessage = new JLabel("Message to be displayed");
	JTextField tf = new JTextField(40);

	JLabel background = new JLabel("Backgraund Color");
	JRadioButton whiteBt = new JRadioButton("White");
	JRadioButton blackBt = new JRadioButton("Black");

	JButton lBt = new JButton("Left");
	JButton rBt = new JButton("Right");
	JButton uBt = new JButton("Up");
	JButton dBt = new JButton("Down");

	String message = "";
	int x = 100;
	int y = 100;
	Color color = Color.BLACK;
	Boolean mouse = false;

	public MovingMassagePanel() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		frame.setSize(800, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());
		frame.add(this, BorderLayout.CENTER);
		frame.add(massagePanel, BorderLayout.NORTH);
		frame.add(colorPanel, BorderLayout.WEST);
		frame.add(mouseBt, BorderLayout.EAST);
		frame.add(directionPanel, BorderLayout.SOUTH);

		massagePanel.setLayout(new FlowLayout());
		massagePanel.add(displayMessage);
		massagePanel.add(tf);

		colorPanel.setLayout(new GridLayout(3, 1));
		colorPanel.add(background);
		colorPanel.add(whiteBt);
		colorPanel.add(blackBt);

		directionPanel.setLayout(new FlowLayout());
		directionPanel.add(lBt);
		directionPanel.add(rBt);
		directionPanel.add(uBt);
		directionPanel.add(dBt);

		tf.addActionListener(this);
		whiteBt.addItemListener(this);
		blackBt.addItemListener(this);
		mouseBt.addItemListener(this);
		lBt.addActionListener(this);
		rBt.addActionListener(this);
		uBt.addActionListener(this);
		dBt.addActionListener(this);
		this.addMouseMotionListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		Font myfont = new Font("SansSerif", Font.BOLD, 40);
		g.setFont(myfont);
		g.drawString(message, x, y);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (mouseBt.isSelected() == true) {
			x = e.getX();
			y = e.getY();
			repaint();
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == blackBt) {
			this.setBackground(Color.black);
			color = Color.pink;
			repaint();
		} else if (e.getSource() == whiteBt) {
			this.setBackground(Color.white);
			color = Color.black;
			repaint();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tf) {
			message = e.getActionCommand();
			repaint();
		} else if (e.getSource() == lBt) {
			x -= 5;
			repaint();
		} else if (e.getSource() == rBt) {
			x += 5;
			repaint();
		} else if (e.getSource() == uBt) {
			y -= 5;
			repaint();
		} else if (e.getSource() == dBt) {
			y += 5;
			repaint();
		}

	}

}
