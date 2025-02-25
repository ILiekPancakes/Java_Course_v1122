package Lab05;
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class BugPanel extends JPanel
   {
      private BufferedImage myImage;
      final int N = 400;
       public BugPanel()
      {
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
      
         Bug bug1 = new Bug(0, 0);
         Bug bug2 = new Bug(N, 0);
         Bug bug3 = new Bug(N, N);
         Bug bug4 = new Bug(0, N);
         
         while(!bug1.sameSpot(bug2)) {
        	 bug1.walkTowards(bug2, 0.10);
        	 bug2.walkTowards(bug3, 0.10);
        	 bug3.walkTowards(bug4, 0.10);
        	 bug4.walkTowards(bug1, 0.10);
        	 
        	 buffer.drawLine(bug1.getX(), bug1.getY(), bug2.getX(), bug2.getY());
        	 buffer.drawLine(bug2.getX(), bug2.getY(), bug3.getX(), bug3.getY());
        	 buffer.drawLine(bug3.getX(), bug3.getY(), bug4.getX(), bug4.getY());
        	 buffer.drawLine(bug4.getX(), bug4.getY(), bug1.getX(), bug1.getY());
        	 
         }
         
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }