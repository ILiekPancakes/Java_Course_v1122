
public class Democrat extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		if (!leftIsClear() && frontIsClear()) {
			move();
		}

	}

	@Override
	public void turnToTheNextSegment() {
		if (leftIsClear()) {
			turnLeft();
			move();
		}else {
			turnRight();
		}

	}

}
