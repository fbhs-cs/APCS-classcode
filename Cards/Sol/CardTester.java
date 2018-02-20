import java.util.Arrays;
public class CardTester
{
  public static void main(String[] args)
  {
    System.out.println("Testing makeDeck()");
    Card[] deck = Card.makeDeck(); 
    System.out.println(Arrays.toString(deck));
    System.out.println();
    
    System.out.println("Testing suitHist()");
    int[] histogram = Card.suitHist(deck);
    System.out.println(Arrays.toString(histogram));
    System.out.println();
    
    
    Card aceS = new Card(1,3);
    Card kingS = new Card(13,3);
    System.out.println("Made cards: " + aceS + " " + kingS);
    System.out.println("ace.compareTo(king) = "+aceS.compareTo(kingS)+" (should be 1)");
    
    System.out.println();
    
    System.out.println("Making hands...");
    
    Card tenH = new Card(10,2);
    Card jackH = new Card(11,2);
    Card queenH = new Card(12,2);
    Card kingH = new Card(13,2);
    Card aceH = new Card(1,2);
    Card[] hand1 = {aceS,kingS,tenH,jackH,queenH,kingH,aceH};
    Card[] hand2 = {tenH,jackH,queenH,kingH,aceH};
    Card[] hand3 = {aceS,kingS,jackH,queenH,tenH};
    
    System.out.println("hand1: " + Arrays.toString(hand1));
    System.out.println(Arrays.toString(Card.suitHist(hand1)));
    System.out.println("hasFlush(hand1): " + Card.hasFlush(hand1));
    System.out.println();
    System.out.println("hand2: " + Arrays.toString(hand2));
    System.out.println(Arrays.toString(Card.suitHist(hand2)));
    System.out.println("hasFlush(hand2): " + Card.hasFlush(hand2));
    System.out.println();
    System.out.println("hand3: " + Arrays.toString(hand3));
    System.out.println(Arrays.toString(Card.suitHist(hand3)));
    System.out.println("hasFlush(hand3): " + Card.hasFlush(hand3));
  }
}