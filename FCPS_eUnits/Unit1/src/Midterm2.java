import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Midterm2 {

	public static void main(String[] args) {
		Display.openWorld("maps/school.map");
		Display.setSize(10,10);
		Display.setSpeed(10);
		
		Democrat lisa = new Democrat();
		Robot pete = new Robot(4,5,Display.SOUTH, 0);
		
		for (int i=0;i<17;) { 
			if (!lisa.leftIsClear() && lisa.frontIsClear()) {
				lisa.move();
			}
		if (lisa.leftIsClear()) {
			lisa.turnLeft();
			lisa.move();
			i++;
		}else {
			lisa.turnRight();
		}
		if (lisa.nextToABeeper()) {
			lisa.pickBeeper();
		}
		}
		lisa.turnLeft();
		lisa.move();
		lisa.putBeeper();
		lisa.putBeeper();
		lisa.turnAround();
		lisa.move();
		}
}
