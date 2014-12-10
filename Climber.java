import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Climber extends Athlete 
{
   public Climber()
  {
   super(8, 1, Display.NORTH, 1);
  }
   public Climber(int x, int y, int dir, int beep)
  {
   super(x, y, dir, beep);
  }
   public void climbUpLeft()
  {
   move();
   move();
   turnLeft();
   move();
   turnRight();
  }
   public void climbDownLeft()
  {
   turnRight();
   move();
   turnLeft();
   move();
   move();
  }
   public void climbUpRight()
  {
   move();
   move();   
   turnRight();
   move();


   turnLeft();
  }
   public void climbDownRight()
  {
   turnLeft();
   move();
   turnRight();
   move();
   move();
  }
  
}
  
