package Lab09;

import edu.fcps.Turtle;
public class TwistyTurtle3 extends Turtle implements Runnable {

	public int beginLength;
	public int endLength;
	public int inc;
	public int angle;
	
	public TwistyTurtle3(int blen, int elen, int in, int ang) {
		
		beginLength = blen;
		endLength = elen;
		inc = in;
		angle = ang;
	}
	
	public void drawShape() {
		
		
		for (int i = beginLength; i <= endLength; i += 2) {
			
			forward(i);
			turnLeft(45);
			forward(i);
			turnLeft(90);
			forward(i);
			turnLeft(90);
			forward(i);
			turnLeft(90);
		}
	}
   
   public void run() {
      drawShape();
      }

}
