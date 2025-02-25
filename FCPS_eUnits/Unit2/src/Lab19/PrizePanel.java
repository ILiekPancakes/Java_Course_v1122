package Lab19;
   import javax.swing.*;

import Lab11.Ball;
import Lab10.Polkadot;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot[] myPDarray;
      private Timer t; 
      private int hits = -1;
      
      private int x;
      private int y;
		//constructor   
       public PrizePanel()
      {
    	   myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           ball = new Ball(50, 50, 50, Color.BLACK);
           myPDarray = new Polkadot[50];
           for(int k=0; k<myPDarray.length; k++) {
        	   x = (int)(Math.random() * FRAME);
        	   y = (int)(Math.random() * FRAME);
        	   myPDarray[k] = new Polkadot(x, y, 25, Color.red);
           }
          
           t = new Timer(5, new Listener());
           t.start();  
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
        	  myBuffer.setColor(BACKGROUND);
        	  myBuffer.fillRect(0, 0, FRAME, FRAME);
        	  
        	  ball.move(FRAME, FRAME);
        	  collide(ball, myPDarray);
        	  
        	  ball.draw(myBuffer);
        	  for(int k =0; k<myPDarray.length; k++) {
        		  myPDarray[k].draw(myBuffer);
        	  }
        	  
        	  myBuffer.setColor(Color.black);
        	  myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
        	  myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
        	  repaint();
         }
      }   
       private void collide(Ball b, Polkadot[] myPDarray)
      {
    	for(int k=0; k<myPDarray.length; k++) {
    		   double d = distance(myPDarray[k].getX(), myPDarray[k].getY(), b.getX(), b.getY());
    		   if(d<= b.getRadius()+myPDarray[k].getRadius()){
    			   	hits++;
    			   	myPDarray[k].jump(FRAME, FRAME);
    		   }
        
        }
		
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return  	 Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
      }
   }