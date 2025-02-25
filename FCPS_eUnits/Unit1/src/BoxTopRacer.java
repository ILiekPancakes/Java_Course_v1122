
public class BoxTopRacer extends Racer {

	public BoxTopRacer(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jumpRight() {
		turnLeft();
		while (!rightIsClear()) {
			move();
		}
		turnRight();
		move();
		while (!rightIsClear()) {
			move();
		}
		turnRight();
		while (frontIsClear()) {
		move();
		}
		turnLeft();
	}

}
