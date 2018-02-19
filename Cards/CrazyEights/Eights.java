import java.util.Scanner;

public class Eights
{
  protected Player one;
  protected Player two;
  protected Hand drawPile;
  protected Hand discardPile;
  protected Scanner in;
  
  public Eights()
  {
    Deck deck = new Deck("Deck");
    deck.shuffle();
    
    int handSize = 5;
    one = new NPlayer("Alice");
    deck.deal(one.getHand(), handSize);
    
    two = new Genius("Bob");
    deck.deal(two.getHand(), handSize);
    
    discardPile = new Hand("Discards");
    deck.deal(discardPile, 1);
    
    drawPile = new Hand("Draw Pile");
    deck.dealAll(drawPile);
    
    in = new Scanner(System.in);
  }

  public boolean isDone()
  {
    return one.getHand().empty() || two.getHand().empty();
  }
  
  public void reshuffle()
  {
    Card prev = discardPile.popCard();
    discardPile.dealAll(drawPile);
    discardPile.addCard(prev);
    drawPile.shuffle();
  }
  
  public Card draw()
  {
    if (drawPile.empty())
      reshuffle();
    return drawPile.popCard();
  }
  
  public Player nextPlayer(Player current) 
  {
    if (current == one)
      return two;
    else
      return one;
  }
  
  public void displayState()
  {
    one.display();
    two.display();
    discardPile.displayLast();
    System.out.println("Draw Pile: ");
    System.out.println(drawPile.size() + " cards");
  }
  
  public void waitForUser()
  {
    in.nextLine();
  }
  
  public void takeTurn(Player player)
  {
    Card prev = discardPile.last();
    Card next = player.play(this, prev);
    discardPile.addCard(next);
    
    System.out.println(player.getName() + " plays " + next);
    System.out.println();
  }
  
  public void playGame()
  {
    Player player = one;
    
    //keep going until there's a winner
    while (!isDone())
    {
      displayState();
      System.out.println("-------------");
      waitForUser();
      takeTurn(player);
      player = nextPlayer(player);
      
    }
    
    one.displayScore();
    two.displayScore();
  }
  
}