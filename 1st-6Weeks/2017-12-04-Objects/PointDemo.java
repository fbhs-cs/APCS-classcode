import java.awt.Point;
public class PointDemo
{
  public static double findSlope(Point a, Point b)
  {
    double dy = b.y - a.y;
    double dx = b.x - a.x;
    double slope = dy / dx;
    return slope;
  }
  public static void main(String[] args)
 {
   Point p1 = new Point(1, 4);
   Point p2 = new Point(-3, 2);
   System.out.printf("Slope: %.3f\n",findSlope(p1,p2));
 }
}

