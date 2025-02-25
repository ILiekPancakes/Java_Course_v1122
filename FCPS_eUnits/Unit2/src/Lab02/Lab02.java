package Lab02;
import javax.swing.JFrame;

public class Lab02 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Unit 2, Lab02: Our Fearless Leader");
		frame.setSize(400,400);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}
	
}