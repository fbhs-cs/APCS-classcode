
public class ValueMethodsDemo
{
  
  /** Find the area of a triangle with side lengths a, b, and c
    * using Heron's Formula.
    * 
    * @param a side length 
    * @param b side length
    * @param c side length
    * @return area of the triangle, or -1.0 if the given measurements are invalid
    */
  public static double herons(double a, double b, double c)
  {
   return 0.0;
  }
  
  /** Determine whether or not a triangle can be formed using
    * the given side lengths
    * 
    * @param a side length
    * @param b side length
    * @param c side length
    * @return true if a triangle can be formed, false otherwise
    */
  public static boolean isTriangle(double a, double b, double c)
  {
    double l; //largest side
    double m; //middle side
    double s; //smallest side
    
    if(a > b && a > c) {  
      l = a; 
      m = b;
      s = c;
    }
    else if ( b > c )  {  
      l = b;
      m = a;
      s = c;
    }
    else {  
      l = c; 
      m = a;
      s = b;
    }
      
    
    if (s + m > l)
    {
      return true;
    }
    else
    {
      return false;
    }
    
  }
  
  
  
  
  
  
  public static void main(String[] args)
  {
    
  }
  
}