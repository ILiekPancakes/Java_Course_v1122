import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {
	
	public Dorothy () {
		super (2,2,Display.EAST, 0 );
	}
	
	public boolean findpath() {
		int counter = 0;
      
      if(nextToABeeper()){
         turnLeft();
         return true;
      }
      
      while (!nextToABeeper()){
         turnAround();
         move();
         turnAround();
         turnLeft();
         counter++;
         if (counter == 2)
            turnLeft();
            
         move();
         
         if (counter > 2){
            turnAround();
            move();
            turnAround();
            return false;
            }
        }
        return true;
	}
   
	public void followpath() {
      while (nextToABeeper() && frontIsClear()){
         move();
         }
		
	}
}
