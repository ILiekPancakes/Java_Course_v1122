	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
	@Override
	public void workCorner() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveOneBlock() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnToTheRight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnToTheNorth() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		int[] counterAry = new int[10];
		
		for(int i=0;i<counterAry.length;i++) {
			while (nextToABeeper()) {
				pickBeeper();
				counterAry[i]++;
			}
			if (i>0) {
				for (int j=0;j<counterAry[i-1];j++ ) {
					putBeeper();
				}
			}
			move();
		}
		
	}
   }