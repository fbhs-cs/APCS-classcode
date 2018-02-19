public class NPlayer extends Player
{
  public NPlayer(String name) {
    super(name);
  }
  
  public Card searchForMatch(Card prev)
  {
    for (int i = 0; i < hand.size(); i++)
    {
      Card card = hand.getCard(i);
      if(cardMatches(card, prev))
      {
        return hand.popCard(i);
      }
    }
    return null;
  }
  
  
}
