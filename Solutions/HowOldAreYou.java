import java.util.Scanner;

public class HowOldAreYou
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    
    System.out.print("Hey, what's your name?");
    String name = input.nextLine();
    System.out.print("Ok," + name + ", how old are you?");
    int age = input.nextInt();
    
    if (age <16)
    {
      System.out.println("You can't drive, " + name);
    }
    if (age <18)
    {
      System.out.println("you can't vote, " + name);
    }
    if (age <25)
    {
      System.out.println("you can't rent a car, " + name);
    }
    if (age >=25)
    {
      System.out.println("You can do anything that is legal, " + name);
    }
    
    
    
  }
}