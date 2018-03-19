/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  
   Card card1 = new Card("Ace","Spades",11);
   Card card2 = new Card("King","Hearts",10);
   Card card3 = new Card("8","Clubs",8);
   
   System.out.println(card1);
   System.out.println("card1 == card2:" + card1.equals(card2));
   System.out.println(card1.rank());
   System.out.println(card2.suit());
   System.out.println(card3.pointValue());
   
 }
}
