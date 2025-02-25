import edu.fcps.Digit;

public class dash extends Digit implements Runnable {

	public dash(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		segment1_Off();
		segment2_Off();
		segment3_Off();
		segment4_Off();
		segment5_Off();
		segment6_Off();
		segment7_On();

	}

}
