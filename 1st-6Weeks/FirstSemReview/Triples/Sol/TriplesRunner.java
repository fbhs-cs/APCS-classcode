/* Save a copy of this file in the
 * parent directory (Triples) and
 * delete this comment.
 */


public class TriplesRunner
{
  public static void main(String args[])
  {
    /*uncomment below this line when your class 
    is finished.*/
    
    Triples n = new Triples(110);
    System.out.println("Pythogorean triples less than 110");
    System.out.println(n);
    System.out.println();
    System.out.println("Pythagorean triples less than 45");
    n.setNum(45);
    System.out.println(n);
  }
}