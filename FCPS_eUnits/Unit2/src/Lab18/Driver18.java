package Lab18;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver18 extends JPanel{
	
	public Driver18() {
		super();
	}
	
	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.turnLeft(1);
		for(int k = 0; k < 360; k++) {
			t.forward(5);
			t.turnLeft(90);
		}
		
		JFrame f = new JFrame("Unit2, Lab18");
		f.setSize(800,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Driver18());
		f.setVisible(true);
				
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(Turtle.getImage(), 0, 0, getWidth(), getHeight(), null);
	}
	
	
}
