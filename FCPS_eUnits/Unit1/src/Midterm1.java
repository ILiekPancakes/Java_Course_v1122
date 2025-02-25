import edu.fcps.karel2.Display;

public class Midterm1 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSize(36,32);
		Display.setSpeed(10);
		
		//new E(2,9).display();
		
		Thread E1 = new Thread( new E(2,9) );
		Thread E2 = new Thread( new E(8,9) );
		Thread D1 = new Thread( new dash(14,9) );
		Thread Z = new Thread( new Zero(20,9) );
		Thread S = new Thread( new Seven(26,9) );
     
        E1.start();
        E2.start();
        D1.start();
        Z.start();
        S.start();

	}

}
