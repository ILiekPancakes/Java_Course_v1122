package Lab01;
import javax.swing.JFrame;
import java.awt.Color;

import Lab00.Panel00;

public class Lab01 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Unit 2, Lab01: Build a House");
		frame.setSize(400,400);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		
		frame.setVisible(true);
	}
	
}