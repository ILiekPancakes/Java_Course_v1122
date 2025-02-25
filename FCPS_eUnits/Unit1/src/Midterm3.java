import edu.fcps.karel2.Display;

public class Midterm3 {
	
	public static void runb (Athlete arg) {
		while (arg.frontIsClear()) {
		arg.putBeeper();
		arg.move();
		}	
	}
	
	public static void rdetect (Athlete arg) {
		arg.putBeeper();
		arg.turnAround();
		while (!arg.rightIsClear()) {
		arg.move();
		}	
		arg.turnRight();
		arg.move();
		if (arg.rightIsClear()) {
			arg.turnRight();
			while (arg.frontIsClear()) {
				arg.move();
			}
			arg.turnAround();
		}else {
		arg.turnLeft();
		}
	}
	public static void ldetect (Athlete arg) {
		arg.putBeeper();
		arg.turnAround();
		while (!arg.leftIsClear()) {
		arg.move();
		}	
		arg.turnLeft();
		arg.move();
		if (arg.leftIsClear()) {
			arg.turnLeft();
			while (arg.frontIsClear()) {
				arg.move();
			}
			arg.turnAround();
		}else {
		arg.turnRight();
		}
	}
	
	public static void gohome (Athlete arg) {
		for (int i=0;i<9;i++) {
			while (!arg.rightIsClear()) {
				arg.move();
			}
			arg.turnRight();
			arg.move();
			arg.turnRight();
			while (arg.frontIsClear()) {
				arg.move();
			}
			arg.turnAround();
		}
	}

	public static void main(String[] args) {
		Display.openWorld("maps/mop.map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		
		Athlete ath = new Athlete (1, 1, Display.EAST, Display.INFINITY);
		
		runb (ath);
		rdetect (ath);
		runb (ath);
		ldetect (ath);
		runb (ath);
		rdetect (ath);
		runb (ath);
		ldetect (ath);
		runb (ath);
		rdetect (ath);
		runb (ath);
		ldetect (ath);
		runb (ath);
		rdetect (ath);
		runb (ath);
		ldetect (ath);
		runb (ath);
		rdetect (ath);
		runb (ath);
		ath.putBeeper();
		ath.turnAround();
		gohome (ath);
		ath.turnAround();

	}

}
