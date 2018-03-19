/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   
   // Testing Deck
   String[] ranks = {"jack","queen","king"};
   String[] suits = {"blue","red"};
   int[] pointValues = {11,12,13};
   Deck d = new Deck(ranks,suits,pointValues);
   System.out.println("Printing Deck...");
   System.out.println(d);
   //System.out.println(d.isEmpty());
   System.out.println("Dealing...");
   while (!d.isEmpty())
   {
     System.out.println(d.deal());
   }
   System.out.println("Printing deck...");
   System.out.println(d);
   
   
   // Twenty One Deck
   String[] twentyOneRanks = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
   String[] twentyOneSuits = {"spades","hearts","clubs","diamonds"};
   int[] twentyOneValues = {11,10,10,10,10,9,8,7,6,5,4,3,2};
   
   Deck twentyOneDeck = new Deck(twentyOneRanks, twentyOneSuits, twentyOneValues);
   System.out.println(twentyOneDeck);
  
 
 }
}
