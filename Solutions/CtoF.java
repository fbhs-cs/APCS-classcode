/** 
 * Converts Celcius to Fahrenheit
 */

import java.util.Scanner;

public class CtoF
{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
   
    System.out.print("How many degrees Celcius? ");
    double celcius = input.nextDouble();
    
    double fahren = celcius * 9 / 5 + 32;
    
    System.out.printf("%.1f C = %.1f F \n", celcius, fahren);
    
    
  }
  
  
  
  
}