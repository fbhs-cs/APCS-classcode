/**An example program for using the for loop
  */

/* Every loop has four basic parts that
 * MUST be present in order for the loop
 * to work properly and effictively:
 * 
 * 1) START
 * 2) CHECK
 * 3) ACTION
 * 4) STEP
 */

public class forLoopExample
{
  public static void drawWall(int size, int start)
  {
   for(int i = 0; i < size; i++)
   {
     System.out.print("-");
   }
   System.out.println();
  }
  
  public static void main(String[] args)
  {
    //loop control variable declared, but not initialized
    //int i;
    //start, check, and step all in one compound statement
    for (int i = 1; i <= 10; i++)
    {
      System.out.print("Hello "); //action
    }
    //first statement after the loop
    System.out.println("Loop is finished...");
    drawWall(50,10);
  }
}