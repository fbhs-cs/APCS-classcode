import junit.framework.TestCase;

public class TestValueMethodsDemo extends TestCase
{
  
  public void testHerons()
  {
    double error = .0001;
    assertEquals(24.5446,ValueMethodsDemo.herons(5,10,12),error);
    assertEquals(6.0,ValueMethodsDemo.herons(3,4,5),error);
    assertEquals(-1.0,ValueMethodsDemo.herons(1,1,8),error);
  }
  
  
  public void testIsTriangle()
  {
    assertEquals(true,ValueMethodsDemo.isTriangle(4,4,4)); 
    assertEquals(false,ValueMethodsDemo.isTriangle(3,3,10));
    assertEquals(false,ValueMethodsDemo.isTriangle(1,1,2));
    assertEquals(false,ValueMethodsDemo.isTriangle(10,1,4));
    assertEquals(true,ValueMethodsDemo.isTriangle(4,15,12));
    assertEquals(true,ValueMethodsDemo.isTriangle(8,8,4));
    assertEquals(false,ValueMethodsDemo.isTriangle(3,5,8));
  }
}

