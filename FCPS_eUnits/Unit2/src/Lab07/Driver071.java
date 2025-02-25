package Lab07;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver071
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Lab06.TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(160, 300, 0,300.0, 5, 144);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         
         PolygonTurtle smsdge = new PolygonTurtle(160, 300, 0,2.7, 360, -1);
         smsdge.setColor(Color.BLUE);
         smsdge.setThickness(6);
         smsdge.drawShape1();
         
         
      }
   }