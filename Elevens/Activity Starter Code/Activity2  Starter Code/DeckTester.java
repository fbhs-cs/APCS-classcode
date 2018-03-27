/**
 * This is a class that tests the Deck class.
 */
import java.util.Scanner;

public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   // Testing Deck #1
   String[] ranks = {"jack","queen","king"};
   String[] suits = {"blue","red"};
   int[] pointValues = {11,12,13};
   Deck d1 = new Deck(ranks,suits,pointValues);
   System.out.println("Printing Deck #1...");
   System.out.println(d1);
   System.out.println("size(): " + d1.size());
   System.out.println("isEmpty(): " + d1.isEmpty());
   System.out.println("Dealing...");
   System.out.println(d1.deal());
   System.out.println("Printing deck...");
   System.out.println(d1);
   
   
   // Testing deck #2
   String[] ranks2 = {"dog","cat","bird"};
   String[] suits2 = {"brown","red"};
   int[] pointValues2 = {1,2,3};
   Deck d2 = new Deck(ranks2,suits2,pointValues2);
   System.out.println("Printing Deck #2...");
   System.out.println(d2);
   System.out.println("size(): " + d2.size());
   System.out.println("isEmpty(): " + d2.isEmpty());
   System.out.println("Dealing...");
   while (!d2.isEmpty())
   {
     System.out.println(d2.deal());
   }
   System.out.println("Printing deck...");
   System.out.println(d2);
   
   
   // Testing deck #3
   String[] ranks3 = {"car","plane","train","bike"};
   String[] suits3 = {"yellow","white","grey"};
   int[] pointValues3 = {1,2,3,4};
   Deck d3 = new Deck(ranks3,suits3,pointValues3);
   System.out.println("Printing Deck #3...");
   System.out.println(d3);
   System.out.println("size(): " + d3.size());
   System.out.println("isEmpty(): " + d3.isEmpty());
   System.out.println("Dealing...");
   System.out.println(d3.deal());
   System.out.println(d3.deal());
   System.out.println(d3.deal());
   System.out.println("Printing deck...");
   System.out.println(d3);
   
   
   
   // Twenty One Deck
   String[] twentyOneRanks = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
   String[] twentyOneSuits = {"spades","hearts","clubs","diamonds"};
   int[] twentyOneValues = {11,10,10,10,10,9,8,7,6,5,4,3,2};
   
   Deck twentyOneDeck = new Deck(twentyOneRanks, twentyOneSuits, twentyOneValues);
//   System.out.println("Printing deck...");
//   System.out.println(twentyOneDeck);
//   System.out.println("Dealing...");
//   while (!twentyOneDeck.isEmpty())
//   {
//     System.out.println(twentyOneDeck.deal());
//   }
//   System.out.println("Printing deck...");
//   System.out.println(twentyOneDeck);
   
   
   
   
 
 }
}
