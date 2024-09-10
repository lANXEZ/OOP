import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame{
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JTextField timeTF = new JTextField("Microwave Time Display");
	JButton foodBT = new JButton("Food to be placed here");
	
	Microwave(String title){
		super(title);
		p1.setLayout(new GridLayout(4,3));
		for(int i = 1; i <= 9; i++) {
			p1.add(new JButton(""+i));
		}
		p1.add(new JButton("Stop"));
		p1.add(new JButton("0"));
		p1.add(new JButton("Start"));
		
		p2.setLayout(new BorderLayout());
		p2.add(timeTF, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		setLayout(new BorderLayout());
		add(foodBT, BorderLayout.CENTER);
		add(p2, BorderLayout.EAST);
		
	}
	
	

}
