package Lab01;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Panel01 extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		g.setFont(new Font("Serif", Font.ITALIC, 20));
		g.setColor(Color.black);
		g.drawString("Welcome Home", 40, 40);
		g.setColor(Color.yellow);
		g.fillOval(300, 75, 50, 50);
		g.setColor(Color.black);
		int xpoints[] = {75, 175, 275};
		int ypoints[] = {200,150,200};
		g.drawPolygon(xpoints, ypoints, 3);
		g.drawRect(100, 200, 150, 150);
		g.fillRect(150, 275, 50, 75);
		g.drawLine(0, 350, 400, 350);
		g.setColor(Color.white);
		for(int i=0; i<400; i+=50) {
			g.fillOval(i, 80, 75, 25);
		}
	}
		
}
