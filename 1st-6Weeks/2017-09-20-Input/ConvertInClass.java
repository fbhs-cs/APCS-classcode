/** 
 * Converts inches into centimeters
 */

import java.util.Scanner;

public class ConvertInClass
{
  public static void main(String[] args)
  {
    final double CM_PER_INCH = 2.54;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many inches? ");
    int inches = input.nextInt();
    double cm = inches * CM_PER_INCH;
    System.out.printf(" %d in. =  %.2f cm.\n",inches,cm);
    
    
    
  }
  
  
  
  
}