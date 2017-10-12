/**A program to generate a random number and compare it to user input 
  * */

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber
{
  
  public static void guessNumber(int randomNumber)
  { 
    System.out.print("Type a number: ");                                 
    Scanner input = new Scanner(System.in);
    int guess = input.nextInt();
   
    
    if (randomNumber == guess)                                                 
    {
      System.out.println("You were correct!");                           
    }
    else if (guess > randomNumber)
    {
      System.out.println("Your guess is too high!");
      guessNumber(randomNumber);
    }
    else
    {
      System.out.println("Your guess is too low!");
      guessNumber(randomNumber);
    }
  }
  
  public static void main(String[] args)
  {
    System.out.print("I'm thinking of a number between 1 and 100 (including both).\n Can you guess what it is?\n");
    
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1; 

    guessNumber(randomNumber);
  }  
}