
public class HillClimber extends Climber {

	public HillClimber() {
		// TODO Auto-generated constructor stub
	}

	public HillClimber(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void climbUpRight() {
		turnLeft();
		move();
		turnRight();
		move();
		move();
	}

	@Override
	public void climbDownRight() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
	}

	@Override
	public void climbUpLeft() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
	}

	@Override
	public void climbDownLeft() {
		move();
		move();
		turnLeft();
		move();
		turnRight();
	}

}
