package Lab08;
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
      
         super.setColor(myColor);
         double interiorAngle = 360/30;
         
         for(int i=0; i<30; i++) {
        	 forward(mySize);
        	 turnLeft(180);
        	 forward(mySize);
        	 turnLeft(180+interiorAngle);
         }
         
      
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
    	  this.turnLeft(180);
    	  this.forward(mySize * 1);
    	  setColor(Color.green);
    	  super.setColor(myColor);
    	  this.forward(mySize * 1.5);    	  
    	  this.turnLeft(180);
    	  this.forward(mySize * 0.5);
    	  this.turnLeft(45);
    	  this.forward(mySize * 0.5);
    	  this.turnLeft(180);
    	  this.forward(mySize * 0.5);
    	  this.turnLeft(90);
    	  this.forward(mySize * 1);
    	  this.turnLeft(180);
    	  this.forward(mySize * 1);
    	  this.turnRight(135);
    	  this.forward(mySize * 1);
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }