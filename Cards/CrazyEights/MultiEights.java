import java.util.ArrayList;
import java.util.Scanner;

public class MultiEights extends Eights
{
  private ArrayList<Player> players;
  
  public MultiEights(int num)
  {
    Deck deck = new Deck("Deck");
    deck.shuffle();
    int handSize = 5;
    players = new ArrayList<Player>();
    for(int i = 1; i <= num; i++)
    {
      players.add(new Genius("Player "+i));
      deck.deal(players.get(i-1).getHand(), handSize);
    }
    
    discardPile = new Hand("Discards");
    deck.deal(discardPile, 1);
    
    drawPile = new Hand("Draw Pile");
    deck.dealAll(drawPile);
    
    in = new Scanner(System.in);
    
  }
  
  public Player nextPlayer(Player current) 
  {
    int curr = players.indexOf(current);
    if(curr == players.size()-1)
      return players.get(0);
    return players.get(curr+1);
  }
  
  public void displayState()
  {
    for(Player p:players)
      p.display();
    discardPile.displayLast();
    System.out.println("Draw Pile: ");
    System.out.println(drawPile.size() + " cards");
  }
  
  public void playGame()
  {
    Player player = players.get(0);
    
    //keep going until there's a winner
    while (!isDone())
    {
      displayState();
      System.out.println("-------------");
      waitForUser();
      takeTurn(player);
      player = nextPlayer(player);
      
    }
    
    for(Player p: players)
      p.displayScore();
  }
  
}