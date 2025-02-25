package Lab09;

import java.awt.Color;

public class TwistyTurtle extends edu.fcps.Turtle {
	private double mySize1;
	private double mySize2;
    private double myIncrement;
    private double myAngle;
    public TwistyTurtle()
    {
       mySize1 = 5;
       mySize2 = 500;
       myIncrement = 10;
       myAngle = 123;
    }
    public TwistyTurtle(double x, double n, double c, double a)
    {
       mySize1 = x;
       mySize2 = n;
       myIncrement = c;
       myAngle = a;
    }

	@Override
	public void drawShape() {
		for(double i=mySize1; i<=mySize2; i+=myIncrement) {
			forward(i);
			turnLeft(myAngle);
		}
		
	}

}
