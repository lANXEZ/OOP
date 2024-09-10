import javax.swing.JFrame;

public class MicrowaveTesting {

	public static void main(String[] args) {
		Microwave m = new Microwave("The Front View of a Microwave Oven");
		m.setSize(550,250);
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
