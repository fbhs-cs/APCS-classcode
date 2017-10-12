import java.util.Scanner;
public class HowOldAreYou2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Hey, what's your name? ");
    String name = input.nextLine();
    System.out.print("Ok, " + name + ", how old are you? ");
    int age = input.nextInt();
    if (age < 16)
    {
      System.out.println("You can't drive, " + name + ".");
    }
    if (16 <= age && age < 18)
    {
      System.out.println("You can drive but not vote, " + name + ".");
    }
    if (18 <= age && age < 25)
    {
      System.out.println("You can vote but not rent a car, " + name + ".");
    }
    else
    {
      System.out.println("You can pretty much do anything, " + name + ".");
    }
  }
}