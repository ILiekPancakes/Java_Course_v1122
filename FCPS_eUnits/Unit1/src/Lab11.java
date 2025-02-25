import edu.fcps.karel2.Display;

public class Lab11 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSize(36,32);
		Display.setSpeed(10);
		
		Zero zero = new Zero(1,18);
		zero.display();
		
		new One(9,18).display();

	}

}
