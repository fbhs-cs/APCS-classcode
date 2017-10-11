import junit.framework.TestCase;

public class TestTriangleArea extends TestCase
{
  
  public void testFindDistance()
  {
    double error = .0001;
    assertEquals(5.65685,TriangleArea.findDistance(1,3,5,7),error);
    assertEquals(9.48683,TriangleArea.findDistance(-1,3,2,12),error);
    assertEquals(13.0384,TriangleArea.findDistance(-2,-3,-15,-2),error);
    assertEquals(0.0,TriangleArea.findDistance(1,1,1,1),error);
  }
  
  public void testTriangleArea()
  {
    double error = .0001;
    assertEquals(9.49999,TriangleArea.triangleArea(-3,4,1,1,6,2),error);
    assertEquals(0.0,TriangleArea.triangleArea(1,1,1,1,1,1),error);
    assertEquals(0.0,TriangleArea.triangleArea(-1,1,0,1,3,1),error);
    assertEquals(3.0, TriangleArea.triangleArea(-1,3,0,1,3,1),error);
    assertEquals(13.7,TriangleArea.triangleArea(-1,7.5,-3,3.2,3,2.4),error);
    assertEquals(0.0,TriangleArea.triangleArea(1,1,2,2,3,3),error);
  }
}