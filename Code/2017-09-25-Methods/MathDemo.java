/** A demonstration of some commonly used Math methods
  */

public class MathDemo
{
  public static void main(String[] args)
  {
    System.out.println("There are a ton of Math methods in the Math class!");
    System.out.println("Here are a few you might be familiar with:");
    System.out.printf("\tsin(pi) = %.1f\n",Math.sin(Math.PI));
    System.out.printf("\tcos(pi) = %.1f\n",Math.cos(Math.PI));
    System.out.printf("\tsqrt(5) = %.3f\n",Math.sqrt(5));
    System.out.printf("\tln(e)   = %.1f\n",Math.log(Math.E));
    System.out.printf("\tlog(2)  = %.3f\n",Math.log10(2));
    System.out.printf("\t180 degrees  = %.3f radians\n",Math.toRadians(180.0));
    System.out.printf("\tpi/4 radians = %.1f degrees\n\n",Math.toDegrees(Math.PI/4));
    
    System.out.println("Others can be found in the Math class documentation...");
    
    //Math class documentation - https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
  }
}