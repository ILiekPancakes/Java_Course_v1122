package Lab14;

   import java.awt.*;

import Lab10.Polkadot;
   
    public class Bumper
   {
    private int myX;
    private int myY;
    private int myXWidth;
    private int myYWidth;
    private Color myColor;
	 
   
   
     //constructors
    	
    	public void setColor(Color myColor) {
    		this.myColor = myColor;
    	}
    	
       public Bumper()         //default constructor
      {
    	   myX = 200;
    	   myY = 200;
    	   myXWidth = 10;
    	   myYWidth = 70;
    	   myColor = Color.blue;
      }
       public Bumper(int x, int y, int xWidth, int yWidth, Color c)
      {
    	   myX = x;
    	   myY = y;
    	   myXWidth = xWidth;
    	   myYWidth = yWidth;
    	   myColor = c;
      }
      
     // accessor methods  (one for each field)
       public int getX() {
    	   return myX;
       }
       
       public int getY() {
    	   return myY;
       }
       
       public int getXWidth(){
    	   return myXWidth;
       }
       
       public int getYWidth() {
    	   return myYWidth;
       }
       
       public Color getColor() {
    	   return myColor;
       }
       
   
     // modifier methods  (one for each field)
       public void setX(int x) {
    	   myX = x;
       }
       
       public void setY(int y) {
    	   myY = y;
       }
       
       public void setXWidth(int XWidth) {
    	   myXWidth = XWidth;
       }
       
       public void setYWidth(int YWidth) {
    	   myYWidth = YWidth;
       }
     
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
        	myX = (int) (Math.random() * (rightEdge - getXWidth())) + myXWidth/2;
            myY = (int) (Math.random() * (bottomEdge - getXWidth())) + myYWidth/2;
      
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getYWidth(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
