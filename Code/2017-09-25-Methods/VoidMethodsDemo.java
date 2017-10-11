/**Demonstration program of void methods
  * Void methods are methods with no "return" value
  */
public class VoidMethodsDemo
{
  
  /**Prints an empty line
    */
  public static void newLine()
  {
    System.out.println();
  }
  
  /**Prints three empty lines
    */
  public static void threeLine()
  {
    newLine();
    newLine();
    newLine();
  }
  
  /**Prints a message twice
    * 
    * @param msg the string to be printed twice
    */
  public static void printTwice(String msg)
  {
    System.out.println(msg);
    System.out.println(msg);
  }
  
  public static void main(String[] args)
  {
    System.out.println("Line 1");
    threeLine();
    System.out.println("Line 2");
    threeLine();
    printTwice("Say this twice!");
  }


}