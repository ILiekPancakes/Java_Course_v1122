package Lab09;

import edu.fcps.Turtle;
public class TwistyTurtle2 extends Turtle implements Runnable {

	public int beginLength;
	public int endLength;
	public int inc;
	public int angle;
	
	public TwistyTurtle2(int blen, int elen, int in, int ang) {
		
		beginLength = blen;
		endLength = elen;
		inc = in;
		angle = ang;
	}
	
	public void drawShape() {
		
		
		for (int i = beginLength; i <= endLength; i += 2) {
			
			forward(i);
			turnRight(30);
		}
	}
   
   public void run() {
      drawShape();
      }

}
