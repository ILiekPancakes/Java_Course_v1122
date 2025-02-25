package Lab08;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
    	  JFrame frame = new JFrame("Flower Turtles");
          frame.setSize(400, 400);
          frame.setLocation(200, 100);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setContentPane(new Lab06.TurtlePanel());
          frame.setVisible(true);
          
          Turtle.clear(Color.white);
          
          Turtle.setCrawl(true);
          
          FlowerTurtle lisa = new FlowerTurtle(100, 25, Color.blue);
          lisa.drawShape();
      }
   }