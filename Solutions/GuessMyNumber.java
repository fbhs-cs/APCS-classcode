import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
  
  public static void getGuess(int num)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a guess: ");
    int guess = in.nextInt();
    
    if(guess == num)
    {
      System.out.println("Great job, you got it!");
    }
    else if (guess < num)
    {
      System.out.println("Too low, try again!");
      getGuess(num);
    }
    else
    {
      System.out.println("Too high, try again!");
      getGuess(num);
    }
  }
  
  public static void main(String[] args)
  {
    
    Random rand = new Random();
    int num = rand.nextInt(100)+1;
    getGuess(num);
    
    
  }
}