import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMICalculator extends JPanel implements ActionListener {

	String finalResult;
	double height;
	double weight;
	double BMI;
	JButton computeBt = new JButton("Compute BMI");
	JTextField text_Height = new JTextField(20);
	JTextField text_Weight = new JTextField(20);
	JLabel result = new JLabel(finalResult);

	public BMICalculator() {
		JPanel panel1_UserInformation = new JPanel();
		JLabel lebel_UserInformation = new JLabel("Enter your information");
		panel1_UserInformation.setLayout(new BorderLayout());
		panel1_UserInformation.add(lebel_UserInformation, BorderLayout.WEST);

		JPanel panel2_HeightAndWeight = new JPanel();
		JLabel lebel_Height = new JLabel("Your height (cm):");
		JLabel lebel_Weight = new JLabel("Your weight (cm):");
		JPanel panel_Height = new JPanel();
		panel_Height.setLayout(new GridLayout(1, 2));
		panel_Height.add(lebel_Height);
		panel_Height.add(text_Height);
		JPanel panel_Weight = new JPanel();
		panel_Weight.setLayout(new GridLayout(1, 2));
		panel_Weight.add(lebel_Weight);
		panel_Weight.add(text_Weight);
		panel2_HeightAndWeight.setLayout(new GridLayout(3, 1));
		panel2_HeightAndWeight.add(panel_Height);
		panel2_HeightAndWeight.add(panel_Weight);
		panel2_HeightAndWeight.add(computeBt);

		JPanel panel3_BMIResult = new JPanel();
		JLabel BMIeq = new JLabel("BMI=");
		panel3_BMIResult.setLayout(new BorderLayout());
		panel3_BMIResult.add(BMIeq, BorderLayout.WEST);
		panel3_BMIResult.add(result, BorderLayout.CENTER);

		this.setLayout(new BorderLayout());
		this.add(panel1_UserInformation, BorderLayout.NORTH);
		this.add(panel2_HeightAndWeight, BorderLayout.CENTER);
		this.add(panel3_BMIResult, BorderLayout.SOUTH);

		text_Height.addActionListener(this);
		text_Weight.addActionListener(this);
		computeBt.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == computeBt) {
			height = Double.parseDouble(text_Height.getText());
			weight = Double.parseDouble(text_Weight.getText());
			double mHeight = height/100;
			BMI = weight/(mHeight*mHeight);
			finalResult = Double.toString(BMI);
			result.setText(finalResult);
			
		}

	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("My BMI Calculator");
		BMICalculator myCalculator = new BMICalculator();
		frame.add(myCalculator);
		
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
