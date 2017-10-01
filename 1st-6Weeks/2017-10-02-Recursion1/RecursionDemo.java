/**A simple demonstration program showing a few recursive methods
  */
public class RecursionDemo
{
  
  
  public static void countDown(int n)
  {
    if (n == 0)
    {
      System.out.println("Blastoff!");
    }
    else
    {
      System.out.println(n);
      countDown(n-1);
    }
  }
  
  public static void nLines(int n)
  {
    if (n > 0)
    {
      System.out.println();
      nLines(n - 1);
    }
  }
  
  public static void forever(String s)
  {
    System.out.println(s);
    forever(s);
  }
  
  public static void countUp(int n)
  {
    if (n == 0)
    {
      System.out.println("Blastoff!");
    }
    else
    {
      countUp(n-1);
      System.out.println(n);
    }
  }
  
  
  public static void displayBinary(int value)
  {
    if (value > 0)
    {
      displayBinary(value / 2);
      System.out.print(value % 2);
    }
  }
  
  public static void main(String[] args)
  {
    //countDown(3);
    //nLines(4);
    //countDown(5);
    //forever("Hello");
    //countUp(5);
    //displayBinary(23);
  }
  
}