package Lab16; 
//Name:    Date:
   import javax.swing.*;
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
      private int hits = 0;
      private boolean connected = false;
      
		//constructor   
       public PrizePanel()
      {
         myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);
         
         
         // part of ball
         int xPos = (int) (Math.random() * (FRAME - 100) + 50);
         int yPos = (int) (Math.random() * (FRAME - 100) + 50);    
         ball = new Ball (xPos, yPos, 50, Color.black);
         
         // part of polkadot
         xPos = (int) (Math.random() * (FRAME - 100) + 50);
         yPos = (int) (Math.random() * (FRAME - 100) + 50); 
         pd = new Polkadot(xPos, yPos, 30, Color.yellow);
         
         // part of mouse
         t = new Timer(5, new Listener());
         t.start();
         
         addMouseListener(new Mouse());
         addKeyListener(new Key());
         setFocusable(true);
         
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
        	 
        	  
        	  
        	  ball.draw(myBuffer);
        	  pd.draw(myBuffer);
        	  
        	  if (distance(ball.getX(), ball.getY(), pd.getX(), pd.getY()) <= (ball.getRadius() + pd.getRadius())) {
        		  pd.jump(FRAME, FRAME);
        		  pd.draw(myBuffer);
        		  hits++;
        	  }
        	  
        	  myBuffer.setColor(Color.black);
        	  myBuffer.setFont(new Font("Serif", Font.BOLD, 30));
        	  myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
        	  
        	  repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(ball.getX(), ball.getY(), pd.getX(), pd.getY());  
		if (d <= ball.getRadius() + pd.getRadius()) {
			
			hits++;
			pd.jump(FRAME, FRAME);
		}
		
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }
       
       private class Mouse extends MouseAdapter {
    	   
    	   public void mousePressed(MouseEvent e) {
    		   if (e.isMetaDown()) {
    			   ball.setX(e.getX());
    			   ball.setY(e.getY());
    		   }
    		   else if (e.isShiftDown()) {
    			   ball.setdx(Math.random()*12 - 6);
    			   ball.setdy(Math.random()*12 - 6);
    		   }
    		   else {
    			   pd.setX(e.getX());
    			   pd.setY(e.getY());
    		   }
    	   }
       }
       
       private class Key extends KeyAdapter {
    	   
    	   public void keyPressed(KeyEvent e) {
    		   
    		   if (e.getKeyCode() == KeyEvent.VK_UP)
    			   ball.setY(ball.getY() - 20);
    		   else if (e.getKeyCode() == KeyEvent.VK_DOWN)
    			   ball.setY(ball.getY() + 20);
    		   else if (e.getKeyCode() == KeyEvent.VK_LEFT)
    			   ball.setX(ball.getX() - 20);
    		   else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    			   ball.setX(ball.getX() + 20);
    		   
    		   if (e.getKeyCode() == KeyEvent.VK_2) {
    			   pd.setY(pd.getY() - 10);
    			   if (pd.getY() <= pd.getRadius()) {
    				   pd.setY(pd.getDiameter());
    			   }
    		   }
    		   else if (e.getKeyCode() == KeyEvent.VK_4) {
    			   pd.setY(pd.getY() + 10);
    			   if (pd.getY() >= FRAME) {
    				   pd.setY(FRAME - pd.getDiameter());
    			   }
    		   }
    		   else if (e.getKeyCode() == KeyEvent.VK_6) {
    			   pd.setX(pd.getX() + 10);
    			   if (pd.getX() >= FRAME) {
    				   pd.setX(FRAME - pd.getDiameter());
    			   }
    		   }
    		   else if (e.getKeyCode() == KeyEvent.VK_8) {
    			   pd.setX(pd.getX() - 10);
    			   if (pd.getX() <= pd.getRadius()) {
    				   pd.setX(pd.getDiameter());
    			   }
    		   }
    	   }
       }
   }