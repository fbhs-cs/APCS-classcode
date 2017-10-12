/** 
 * Converts inches into centimeters
 */

import java.util.Scanner;

public class ConvertCM
{
  public static void main(String[] args)
  {
    final double CM_PER_INCH = 2.54;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("How many centimeters");
    int centi = input.nextInt();
    int inches = (int)(centi/2.54);
    int tfeet = inches / 12;
    int rinches = inches%12;
    System.out.printf("Total: %d feet, %d inches",tfeet, rinches);
    
    
    
    










    //System.out.print("How many feet? ");
    //int feet = input.next
    
    //System.out.print("How many inches? ");
    //int inches = input.nextInt();
    //double cm = inches * CM_PER_INCH;
    //System.out.printf(" %d in. =  %.2f cm.\n",inches,cm);
    
    
    
  }
  
  
  
  
}