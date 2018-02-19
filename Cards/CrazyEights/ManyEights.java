public class ManyEights extends Eights
{
  public ManyEights()
  {
    Deck deck = new Deck("Deck");
    deck.shuffle();
    
    int handSize = 5;
    one = new ManyPlayer("Alice");
    deck.deal(one.getHand(), handSize);
    
    two = new ManyGenius("Bob");
    deck.deal(two.getHand(), handSize);
    
    discardPile = new Hand("Discards");
    deck.deal(discardPile, 1);
    
    drawPile = new Hand("Draw Pile");
    deck.dealAll(drawPile);
  }
  
  public int[] playMany()
  {
    int oneScore = 0;
    int twoScore = 0;
    
    //keep going until there's a winner
      Player player = one;
      while (!isDone())
      {
        //displayState();
        //System.out.println("-------------");
        //waitForUser();
        takeTurn(player);
        player = nextPlayer(player);
        

     
    }
    return new int[]{one.score(), two.score()};
  }
  @Override
  public void takeTurn(Player player)
  {
    Card prev = discardPile.last();
    Card next = player.play(this, prev);
    discardPile.addCard(next);
  }
}