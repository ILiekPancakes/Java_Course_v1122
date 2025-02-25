package Lab16;

import javax.swing.JFrame;

import Lab12.PrizePanel;
public class Driver16
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Unit2, Lab16: Mouse Input");
      frame.setSize(400, 400);
      frame.setLocation(100, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PrizePanel());
      frame.setVisible(true);
   }
}
