package Lab09;
//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab07.PolygonTurtle;
import Lab07.TurtlePanel;
   public class Driver09
   {
      public static void main(String[] args)
      {
      
    	  JFrame frame = new JFrame("Flower Turtles");
          frame.setSize(400, 400);
          frame.setLocation(300, 100);
          frame.setBackground(Color.white);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setContentPane(new TurtlePanel());
          frame.setVisible(true);
          Turtle.clear(Color.white);
       
          TwistyTurtle tt1 = new TwistyTurtle(5, 400, 10, 123);
          TwistyTurtle2 tt2 = new TwistyTurtle2(0, 150, 2, 30);
          TwistyTurtle3 tt3= new TwistyTurtle3(25, 150, 5, 45);
      
          Thread t1 = new Thread(tt1);
          Thread t2 = new Thread(tt2);
          Thread t3 = new Thread(tt3);
          
          t1.start();
          t2.start();
          t3.start();
      }
   }