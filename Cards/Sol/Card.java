public class Card
{
  public static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};
  public static final String[] RANKS = {null,"Ace","2","3","4","5","6",
    "7","8","9","10","Jack","Queen","King"};
  
  private final int suit;
  private final int rank;
  
  
  public Card(int rank, int suit)
  {
    this.rank = rank;
    this.suit = suit;
  }
  
  public int getSuit()
  {
    return this.suit;
  }
  
  public int getRank()
  {
    return this.rank;
  }
  
  public boolean equals(Card other)
  {
    return this.suit == other.suit && this.rank == other.rank;
  }
  
  public int compareTo(Card other)
  {
    if(this.suit < other.suit)
      return -1;
    
    if(this.suit > other.suit)
      return 1;
    
    if(this.rank < other.rank)
      return -1;
    
    if(this.rank > other.rank)
      return 1;
    
    return 0;
  }
  
  public static int search(Card[] cards, Card target)
  {
    for(int i=0;i<cards.length;i++)
    {
      if(cards[i].equals(target))
        return i;
    }
    return -1;
  }
  
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
  
  public static void main(String[] args)
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
    Card t = new Card(6,3);
    int loc = binarySearch(cards,t);
    System.out.println(loc);
    
    
    
    
  }
}