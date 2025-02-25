package Lab03;

import javax.swing.JFrame;

import Lab02.Panel02;

public class Lab03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Unit2, Lab03: Webbing and Sunshine");
		frame.setSize(400,400);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel03());
		frame.setVisible(true);
	}

}
