
public class SquareDancer extends Dancer {

	public SquareDancer(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
		// TODO Auto-generated constructor stub
	}

	public SquareDancer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void danceStep() {
		for (int i=0;i<4;i++) {
			move();
			move();
			turnLeft();
		}
	}

}
