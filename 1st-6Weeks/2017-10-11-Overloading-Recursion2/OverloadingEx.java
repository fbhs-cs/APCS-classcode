public class OverloadingEx
{
  public static double findArea(double length, double width)
  {
    double area = length * width;
    System.out.println("Using rectangle method.");
    return area;
  }
  
  public static double findArea(double radius)
  {
    double area = Math.PI * radius * radius;
    System.out.println("Using circle method.");
    return area;
  }
  
  public static void main(String[] args)
  {
   System.out.println("This is an example of 'overloading' methods.");
   System.out.println("To overload a method means to use the same method\n"
                     +"name multiple times, each with different parameters.\n"
                     +"Java then figures out which method to use based on\n"
                     +"the arguments passed in when the method is called.");
   
   System.out.println();
   System.out.println("Calling findArea(5.0, 10.0)");
   double area1 = findArea(5.0,10.0);
   System.out.printf("The area of the rectangle is %.2f.\n\n",area1);
   System.out.println("Calling findArea(5.0)");
   double area2 = findArea(5.0);
   System.out.printf("The area of the circle is %.2f.\n\n",area2);
  }
  
}
