/** A program to demonstrate generating random numbers in Java
  */

import java.util.Random;

public class RandomDemo
{
  public static void main(String[] args)
  {
    
    //create a "random" object that has some useful methods
    Random random = new Random();
    
    //get a random integer between 0 and 99, then add 1 to it so that it
    //is between 1 and 100.
    int number1 = random.nextInt(100) + 1; 
    int number2 = random.nextInt(1000) + 1;
    int number3 = random.nextInt(11) + 10;
    System.out.println(number1 + " " + number2 + " " + number3);
    
    
  }
}
  
 