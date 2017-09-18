/**
 * In-class demonstration of arithmetic operators
 */
public class ArithmeticDemo 
{
  
  public static void main(String[] args) 
  { 
    //arithmetic operators
    int hours = 10;
    int minutes = 45;
    System.out.print("Number of minutes since midnight: ");
    System.out.println(hours * 60 + minutes);
    
    double a = 5.0;
    int b = 3;
    double c = a / b;
    System.out.print("a / b = ");
    System.out.println(c);
    
    /* Order of operations:
     *   Parentheses
     *   Exponents (squareroots, logarithms)
     *   MD - multiplication or division left to right
     *   AS - addition or subtraction left to right
     *   A - assignment
     */
    
    double slope = 3.0 / 2.0;
    System.out.println("Slope = " + slope);
    
    //floating point errors 
    double x = 0.1 * 9;
    System.out.println("x = " + x);
    double y = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
    System.out.println("y = " + y);
  }
  
}
