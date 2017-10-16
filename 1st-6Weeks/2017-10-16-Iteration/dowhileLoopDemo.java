public class dowhileLoopDemo
{
  
  public static void main(String[] args)
  {
    //start loop control variable
    int i = 1;
    
    //check if condition is true...if so continue,
    //otherwise stop the loop action and fall through
    //to the next program statement
    do
    {
      
      System.out.println("Hello "+i); //action
      i++; //step...increase x adding 1
      
    }
    while (i <= 5);
    //first statement following the loop
    System.out.println("Loop is finished...i = "+i);
  }
  
}