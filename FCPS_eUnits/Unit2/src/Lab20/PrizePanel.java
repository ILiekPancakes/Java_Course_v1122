package Lab20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 800;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private pinBall ball;
      private Prize[] myPDarray;
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
           ball = new pinBall((int)(Math.random() + (FRAME-100)+50), (int)(Math.random() + (FRAME-100)+50), 10, Color.BLACK);
           ball.setbound(FRAME, FRAME);
           
           myPDarray = new Prize[50];
           for(int k=0; k<myPDarray.length; k++) {
        	   x = (int)(Math.random() * FRAME);
        	   y = (int)(Math.random() * FRAME);
        	   myPDarray[k] = new Prize(x, y, Math.random() * 15, Color.red);
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
        	  
        	  for(int k =0; k<myPDarray.length; k++) {
        		  if(ball.intersect(myPDarray[k])&& myPDarray[k].getMyColor()==Color.red) {
        			  myPDarray[k].lightup();
        		  }
        		  myPDarray[k].drawme(myBuffer);
        	  }
        	  
        	  ball.tick();        	  
        	  ball.drawme(myBuffer);
        	  

        	  repaint();
         }
      }   
      /* private void collide(Ball b, Polkadot[] myPDarray)
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
      }*/
   }