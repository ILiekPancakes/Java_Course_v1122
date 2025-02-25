package Lab09;

import java.awt.Color;

import javax.swing.JFrame;

import edu.fcps.Turtle;

public class Driver09 {
	public static void twisties(Turtle arg) {
		arg.drawShape();
	}
	
	 public static void main(String[] args)
     {
   	  /*JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Lab06.TurtlePanel());
         frame.setVisible(true);*/
         
		 Turtle.createFrame();
		 Turtle.clear(Color.white);
		 
         Turtle smidge = new TwistyTurtle(0, 150, 2, 30);
         twisties(smidge);
     }
}
