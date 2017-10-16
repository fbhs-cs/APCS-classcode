/**An example program for using the while loop
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

public class whileLoopDemo
{
  public static void main(String[] args)
  {
    //start loop control variable
    int i = 1;
    
    //check if condition is true...if so continue,
    //otherwise stop the loop action and fall through
    //to the next program statement
    while (i <= 5)
    {
      System.out.println("Hello "+i); //action
      i = i + 1; //step...increase i adding 1
      // i += 1; //alternate ways of incrementing
      // i++;    //yet another way to increment
    }
    //first statement following the loop
    System.out.println("Loop is finished...i = "+i);
  }
  
}