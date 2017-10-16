/**An example program for using the do while loop
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

public class dowhileLoopDemo
{
  public static void main(String[] args)
  {
    //start loop control variable
    int i = 1;
    do
    {
      System.out.println("Hello "+i); //action
      i++; //step...increase i adding 1
    }
    //check condition is at the end
    while (i <= 5); 
    //first statement following the loop
    System.out.println("Loop is finished...i = "+i);
  }
}