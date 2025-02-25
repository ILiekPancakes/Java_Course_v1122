package Lab04;

import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Lab04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Unit2, Lab04: Webbing and Sunshine");
		frame.setSize(600,400);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BucketPanel());
		frame.setVisible(true);
		
		Bucket.setSpeed(1);
		Bucket.useTotal(false);
		
		Bucket five = new Bucket(5);
		Bucket three = new Bucket(3);
		
		five.fill();
		five.pourInto(three);
		three.spill();
		five.pourInto(three);
		five.fill();
		five.pourInto(three);
	}
}
