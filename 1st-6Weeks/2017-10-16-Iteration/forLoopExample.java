public class forLoopExample
{
  
  public static void main(String[] args)
  {
    //loop control variable declared, but not initialized
    int i;
    //start, check, and step all in one compound statement
    for (i = 1; i <= 5; i++)
    {
      System.out.println("Hello "+i); //action
    }
    
    //first statement after the loop
    System.out.println("Loop is finished...i = "+i);
  }
}