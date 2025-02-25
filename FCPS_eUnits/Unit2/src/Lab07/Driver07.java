package Lab07;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Lab06.TurtlePanel());
         frame.setVisible(true);
         
         PolygonTurtle smidge = new PolygonTurtle(50, 300, 0,200.0, 5, 144);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         
         PolygonTurtle smudge = new PolygonTurtle(350, 300, 0,200.0, 7, 154);
         smudge.setColor(Color.BLUE);
         smudge.setThickness(6);
         smudge.drawShape();
      
         PolygonTurtle smadge = new PolygonTurtle(200, 145, 0,200.0, 8, 135);
         smadge.setColor(Color.YELLOW);
         smadge.setThickness(6);
         smadge.drawShape();
         
         PolygonTurtle smodge = new PolygonTurtle(200, 550, 0,200.0, 10, 108);
         smodge.setColor(Color.WHITE);
         smodge.setThickness(6);
         smodge.drawShape();
      }
   }