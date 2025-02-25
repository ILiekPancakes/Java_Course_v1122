	package Lab07;
   import edu.fcps.Turtle;
    public class PolygonTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
      private int myDeg;
       public PolygonTurtle()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public PolygonTurtle(double n, int s, int d)
      {
    	 myDeg = d;
         mySize = n;
         mySides = s;
      }
       public PolygonTurtle(double x, double y, double h, double n, int s, int d)
      {
         super(x, y, h);
         myDeg = d;
         mySize = n;
         mySides = s;
      }
       public void setSize(double n)
      {
         mySize = n;
      }
       public void setSides(int s)
      {
         mySides = s;
      }
       
       public void setDeg(int d)
       {
          myDeg += d;
       }
       
       public void drawShape()
      {
    
    	   for(int i=0; i<mySides; i++) {
    		   this.forward(mySize);
    		   this.turnLeft(myDeg);
    	   }
      
      }
       
       public void drawShape1()
       {
    	   this.turnLeft(105);
     	   for(int i=0; i<mySides; i++) {
     		   this.forward(mySize);
     		   this.turnLeft(myDeg);
     	   }
       
       }
   }