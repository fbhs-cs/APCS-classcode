public class TriangleAreaEx
{
  /** Find the area of a triangle with side lengths 
    * a, b, and c using Heron's Formula.
    * 
    * @param a side length 
    * @param b side length
    * @param c side length
    * @return area of the triangle, or -1.0 if the given 
    *  measurements are invalid
    */
  public static double herons(double a, double b, double c)
  {
    if(!isTriangle(a,b,c))
    {
      return -1.0;
    }
    else
    {
      double s = (a + b + c)/2;
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      return area;
      
    }
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
    double m; //not largest side
    double s; //not largest side
    
    if(a > b && a > c) {  
      l = a; 
      m = b;
      s = c;
    } else if ( b > c )  {  
      l = b;
      m = a;
      s = c;
    } else {  
      l = c; 
      m = a;
      s = b;
    }
    
    
    if (s + m > l) {
      return true;
    } else {
      return false;
    }
    
  }
  
  public static double findDistance(double x1, double y1, double x2, double y2)
  {
    double dx = x2 - x1;
    double dy = y2 - y1;
    double d = Math.sqrt(dx*dx + dy*dy);
    return d;
  }
  
  public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3)
  {
    double sideA = findDistance(x1,y1,x2,y2);
    double sideB = findDistance(x1,y1,x3,y3);
    double sideC = findDistance(x2,y2,x3,y3);
    double area = herons(sideA,sideB,sideC);
    if (area == -1.0)
      return 0.0;
    else  
      return area;
  }
  
  public static void main(String[] args)
  {
    
  }
}