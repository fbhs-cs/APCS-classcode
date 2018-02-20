/** Code from January 22/23 for the Card class implementation */
import java.util.Arrays;

public class Card
{
  public static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};
  public static final String[] RANKS = {null,"Ace","2","3","4","5","6",
    "7","8","9","10","Jack","Queen","King"};
  
  private final int suit;
  private final int rank;
  
  /* constructor */
  public Card(int rank, int suit)
  {
    this.rank = rank;
    this.suit = suit;
  }
  
  /* Getters */
  public int getSuit()
  {
    return this.suit;
  }
  
  public int getRank()
  {
    return this.rank;
  }
  
  
  /* Equals method returns true if the cards are the same
   * suit and rank
   */
  public boolean equals(Card other)
  {
    return this.suit == other.suit && this.rank == other.rank;
  }
  
  /* compareTo method returns -1 if this < other, 1 if this > other, and 
   * 0 of this == other
   */
  public int compareTo(Card other)
  {
    if(this.suit < other.suit)
      return -1;
    
    if(this.suit > other.suit)
      return 1;
    
    // aces are greatest
    if(this.rank == 1 && other.rank != 1)
      return 1;
    
    if(other.rank == 1 && this.rank != 1)
      return -1;
    
    if(this.rank < other.rank)
      return -1;
    
    if(this.rank > other.rank)
      return 1;
    
    return 0;
  }
  
  /* linear search */
  public static int search(Card[] cards, Card target)
  {
    for(int i=0;i<cards.length;i++)
    {
      if(cards[i].equals(target))
        return i;
    }
    return -1;
  }
  
  /* binary search -- see BookCode/Search.java for a recursive version */
  public static int binarySearch(Card[] cards, Card target)
  {
    int min = 0;
    int max = cards.length - 1;
    int cur = (min + max) / 2;
    while(cards[cur].compareTo(target) != 0)
    {
      if(cur == min || cur == max)
        return -1;
      
      if (target.compareTo(cards[cur]) > 0)
      {
        min = cur;
      }
      else if (target.compareTo(cards[cur]) < 0)
      {
        max = cur;
      }
      
      
      cur = (min + max)/2;          
    }
    return cur;
    
  }
  
  
  
  
  public String toString()
  {
//    String[] suits = new String[4];
//    suits[0] = "Clubs";
//    suits[1] = "Diamonds";
//    ...
    
    
    String out = RANKS[this.rank] + " of " + SUITS[this.suit];
    return out;
  }
  
  public static Card[] makeDeck()
  {
    Card[] cards = new Card[52];
    int index = 0;
    for(int suit=0;suit<=3;suit++)
    {
      for(int rank=1;rank<=13;rank++)
      {
        cards[index] = new Card(rank,suit);
        index++;
      }
    }
    return cards;
  }
  
  
  public static int[] suitHist(Card[] cards)
  {
    int[] hist = new int[4];
    for(Card c:cards)
    {
      hist[c.getSuit()]++; 
    }
    return hist;
  }
  
  public static boolean hasFlush(Card[] hand)
  {
   int[] hist = suitHist(hand);
    for(int s:hist) 
    {
      if(s>=5)
        return true;
    }
   return false;
  }
  
  
  public static void main(String[] args)
  {
    System.out.println("Testing makeDeck()");
    Card[] deck = makeDeck(); 
    System.out.println(Arrays.toString(deck));
    System.out.println();
    
    System.out.println("Testing suitHist()");
    int[] histogram = suitHist(deck);
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
    System.out.println(Arrays.toString(suitHist(hand1)));
    System.out.println("hasFlush(hand1): " + hasFlush(hand1));
    System.out.println();
    System.out.println("hand2: " + Arrays.toString(hand2));
    System.out.println(Arrays.toString(suitHist(hand2)));
    System.out.println("hasFlush(hand2): " + hasFlush(hand2));
    System.out.println();
    System.out.println("hand3: " + Arrays.toString(hand3));
    System.out.println(Arrays.toString(suitHist(hand3)));
    System.out.println("hasFlush(hand3): " + hasFlush(hand3));
    
  }
}