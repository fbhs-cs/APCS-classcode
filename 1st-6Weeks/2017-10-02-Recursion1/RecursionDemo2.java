import java.util.Scanner;

public class RecursionDemo2
{
  public static void recFunc(int n)
  {
    System.out.printf("Entered recFunc(%d)",n);
    if (n == 0)
    {
      System.out.println("n == 0, BASE CASE");
    }
    else
    {
      System.out.printf("Calling recFunc(%d)\n",n-1);
      recFunc(n-1);
      System.out.printf("Back in recFunc(%d)\n",n);
    }
  }
  
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many recursions do you want? ");
    int numRec = kb.nextInt();
    recFunc(numRec);
    System.out.println("Back in main.");
  }
}