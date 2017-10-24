import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class TestMoreLoops extends TestCase {
  
  public void testSquareRoot() {
    double error = 0.00001;
    assertEquals(3,MoreLoops.squareRoot(9),error);
    assertEquals(5,MoreLoops.squareRoot(25),error);
    assertEquals(2.68328,MoreLoops.squareRoot(7.2),error);
    assertEquals(3.162278,MoreLoops.squareRoot(10),error);
  }
  
  public void testPower() {
    double error = 0.00001;
    assertEquals(16,MoreLoops.power(4,2),error);
    assertEquals(125,MoreLoops.power(5,3),error);
    assertEquals(140.608, MoreLoops.power(5.2,3),error);
    assertEquals(1,MoreLoops.power(100,0),error);
    assertEquals(0,MoreLoops.power(0,50),error);
    assertEquals(7,MoreLoops.power(7,1),error);
  }
  
  public void testFactorial() {
    assertEquals(1,MoreLoops.factorial(0));
    assertEquals(1,MoreLoops.factorial(1));
    assertEquals(2,MoreLoops.factorial(2));
    assertEquals(720,MoreLoops.factorial(6));
    assertEquals(3628800,MoreLoops.factorial(10));
  }
    
  public void testIsPrime() {
    assertEquals(true,MoreLoops.isPrime(2));
    assertEquals(true,MoreLoops.isPrime(31));
    assertEquals(true,MoreLoops.isPrime(101));
    assertEquals(true,MoreLoops.isPrime(3079));
    assertEquals(false,MoreLoops.isPrime(10));
    assertEquals(false,MoreLoops.isPrime(111));
    assertEquals(false,MoreLoops.isPrime(253));
    assertEquals(false,MoreLoops.isPrime(1));
  }
  
  public void testSumPrime()
  {
    assertEquals(0,MoreLoops.sumPrime(2));
    assertEquals(2,MoreLoops.sumPrime(3));
    assertEquals(5,MoreLoops.sumPrime(5));
    assertEquals(17,MoreLoops.sumPrime(10));
    assertEquals(1060,MoreLoops.sumPrime(100));
    assertEquals(76127,MoreLoops.sumPrime(1000));
  }
}
