import java.util.Arrays;
import java.util.Random;

public class Deck
{
  private Card[] cards;
  private static Random rand = new Random();
  
  Deck()
  {
    cards = new Card[52];
    int index = 0;
    for(int suit=0;suit<=3;suit++)
    {
      for(int rank=1;rank<=13;rank++)
      {
        cards[index] = new Card(rank,suit);
        index++;
      }
    }
  }
  
  Deck(int n)
  {
    cards = new Card[n];
  }
  
  public void print()
  {
    for(Card card:cards)
    {
      if(card != null)
        System.out.println(card);
    }
  }
  
  public String toString()
  {
    return Arrays.toString(cards);
  }
  
  private static int randomInt(int low, int high)
  {
    return rand.nextInt(high - low + 1) + low;
  }
  
  private void swap(int a, int b)
  {
    Card temp = cards[a];
    cards[a] = cards[b];
    cards[b] = temp;
  }
  
  
  public void shuffle()
  {
    for(int count = 0; count < 7; count++)
    {
      for(int i = 0; i < cards.length-1; i++)
      {
        int swapIndex = randomInt(i+1,cards.length-1);
        swap(i, swapIndex);
      }
    }
  }
  
  public void selectionSort()
  {
    for(int i = 0; i < cards.length; i++)
    {
      Card min = cards[i];
      int minIndex = i;
      for(int j = i; j< cards.length; j++)
      {
        if(cards[j].compareTo(min) < 0)
        {
          min = cards[j];
          minIndex = j;
        }
      }
      swap(i, minIndex);
      
    }
    
  }
  
  private void insert(int cardIndex)
  {
    while(cardIndex > 0 &&
          cards[cardIndex].compareTo(cards[cardIndex-1]) < 0)
    {
      swap(cardIndex,--cardIndex);
      //cardIndex--;
    }
  }
  
  public void insertionSort()
  {
    for(int i = 0; i < cards.length; i++)
    {
      this.insert(i);
      //System.out.println("Inserted "+i+": "+this);
    }
  }
  
  private Deck split(int start, int end)
  {
    Deck out = new Deck(end-start+1);
    for(int i = 0; i < out.cards.length; i++)
    {
      out.cards[i] = this.cards[start + i];
    }
    return out;
  }
   
  private static Deck merge(Deck left, Deck right)
  {
    int leftSize = left.cards.length;
    int rightSize = right.cards.length;
    Deck result = new Deck(leftSize + rightSize);
    
    int i = 0; // left counter
    int j = 0; // right counter
    
    // iterate through all elements of result
    for(int k = 0;k<result.cards.length;k++)
    {
      if(i == leftSize)
      {
        result.cards[k] = right.cards[j];
        j++;
      }
      else if(j == rightSize)
      {
        result.cards[k] = left.cards[i];
        i++;
      }
      else if(left.cards[i].compareTo(right.cards[j]) < 0)
      {
        result.cards[k] = left.cards[i];
        i++;
      }
      else
      {
        result.cards[k] = right.cards[j];
        j++;
      } 
    }
    return result;
  }
  
  public Deck almostMergeSort()
  {
    int deckSize = this.cards.length;
    Deck half1 = this.split(0,deckSize/2);
    Deck half2 = this.split(deckSize/2+1, deckSize-1);
    half1.selectionSort();
    half2.selectionSort();
    return merge(half1,half2);
  }
  
    public Deck mergeSort()
    {
      System.out.println(this.cards.length);
      if(this.cards.length <= 1)
        return this;
      
      int deckSize = this.cards.length;
      Deck half1 = this.split(0,deckSize/2-1);
      Deck half2 = this.split(deckSize/2, deckSize-1);
      half1 = half1.mergeSort();
      half2 = half2.mergeSort();
      return merge(half1,half2);
    }
  

public static void main(String[] args)
{
  
  //System.out.println("Making decks...");
  Deck deck1 = new Deck();
  deck1.shuffle();
  System.out.println(deck1);
  deck1 = deck1.mergeSort();
  System.out.println(deck1);
//    Deck deck2 = new Deck(5);
//    System.out.println("Ok.");
//    System.out.println("deck1.print()");
//    deck1.print();
//    System.out.println("deck2.print()");
//    deck2.print();
//    System.out.println("println(deck1)");
//    System.out.println(deck1);
//    System.out.println("println(deck2)");
//    System.out.println(deck2);
  
  
}

}