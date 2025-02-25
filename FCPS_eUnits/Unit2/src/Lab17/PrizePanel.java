package Lab17;
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
      private Polkadot pd;
      private Timer t; 
      private int hits = -1;
		//constructor   
       public PrizePanel()
      {
    	   myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           ball = new Ball(50, 50, 30, Color.red);
           pd = new Polkadot(50, 50, 30, Color.yellow);
           addMouseListener(new Mouse());
           addKeyListener(new Key());
           setFocusable(true);
          
           t = new Timer(5, new Listener());
           t.start();  
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       
       private class Key implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_UP && pd.getY()-20>=0) {
				pd.setY(pd.getY()-20);
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT && pd.getX()-20>=0) {
				pd.setX(pd.getX()-20);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN && pd.getY()+20<=FRAME) {
				pd.setY(pd.getY()+20);
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT && pd.getX()+20<=FRAME) {
				pd.setX(pd.getX()+20);
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
    	   
       }
       
       private class Mouse extends MouseAdapter{
    	   public void mousePressed(MouseEvent e) {
    		   if(e.isAltDown()) {
    			   ball.setX(e.getX());
    			   ball.setY(e.getY());
    		   } else if(e.isShiftDown()) {
    			   ball.setdx(Math.random() * 12-6);
    			   ball.setdy(Math.random() * 12-6);
    		   } else {
    			   pd.setX(e.getX());
    			   pd.setY(e.getY());
    		   }
    	   }
       }
       
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
        	  myBuffer.setColor(BACKGROUND);
        	  myBuffer.fillRect(0, 0, FRAME, FRAME);
        	  
        	  ball.move(FRAME, FRAME);
        	  collide(ball, pd);
        	  
        	  ball.draw(myBuffer);
        	  pd.draw(myBuffer);
        	  
        	  myBuffer.setColor(Color.black);
        	  myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
        	  myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
        	  repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(pd.getX(), pd.getY(), b.getX(), b.getY());
        if(d<= b.getRadius()+pd.getRadius()){
        	hits++;
        	pd.jump(FRAME, FRAME);
        }
		
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return  	 Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
      }
   }