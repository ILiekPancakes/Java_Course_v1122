import edu.fcps.karel2.Display;

public class Lab03 {

	public static void main(String[] args) {
		Display.openWorld("maps/mountain.map");
		Display.setSize(16, 16);
		Climber climber = new Climber(8);
		
		climber.turnRight();
		climber.move();
		climber.climbUpRight();
		climber.climbUpRight();
		climber.climbUpRight();
		climber.climbDownRight();
		climber.climbDownRight();
		climber.pickBeeper();
		climber.turnAround();
		climber.climbUpLeft();
		climber.climbUpLeft();
		climber.climbDownLeft();
		climber.climbDownLeft();
		climber.climbDownLeft();
		climber.move();
		
	}

}
