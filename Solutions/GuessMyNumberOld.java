import java.util.Random;
import java.util.Scanner;


public class GuessMyNumberOld
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Im thinking of a number between 1 and 100");
    int number = random.nextInt(100) + 1;
    System.out.println("Can you guess what it is?");
    System.out.println("Type your guess: ");
    int rnum = input.nextInt();
    System.out.println("Your Guess: "+rnum);
    System.out.println("My Guess was: "+ number);
    int offby = Math.abs(number - rnum);
    System.out.println("You were off by: "+offby);
    
    
    
    
    
    
  }
}