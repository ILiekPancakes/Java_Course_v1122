package Lab02;

import java.awt.*;
import javax.swing.*;

public class Panel02 extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.blue.darker());
		g.fillRect(0, 0, 400, 400);
		
		g.setColor(Color.yellow);
		
		int xPoint = 130;
		int yPoint = 75;
		
		int x = xPoint;
		int y = yPoint;
		
		for(int i = 1; i<=10; i++) {
			g.fillOval(x, y, 20, 20);
			y += 20;
		}
		
		x = xPoint + 20*7;
		y = yPoint;
		
		for(int i = 1; i<=10; i++) {
			g.fillOval(x, y, 20, 20);
			y += 20;
		}
		
		x = xPoint;
		y = yPoint;
		
		for(int i = 1; i<=8; i++) {
			g.fillOval(x, y, 20, 20);
			x += 20;
		}
		
		x = xPoint;
		y = yPoint + 20*9;
		
		for(int i = 1; i<=8; i++) {
			g.fillOval(x, y, 20, 20);
			x += 20;
		}
		
		x = xPoint + 10;
		y = yPoint + 10;
		
		g.fillRect(x, y, 140, 180);
		
		ImageIcon thomas = new ImageIcon("src/Lab02/tj.jpg");
		g.drawImage(thomas.getImage(), 150, 95, 120, 160, null);
		g.setColor(Color.white);
		g.setFont(new Font("ScanSerif", Font.ITALIC, 30));
		g.drawString("Our Fearless Leader", 70, 320);
		
		
		
	}
	
}
