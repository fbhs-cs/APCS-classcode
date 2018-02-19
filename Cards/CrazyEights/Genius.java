public class Genius extends Player
{
  public Genius(String name)
  {
    super(name);
  }
  
  @Override
  public Card searchForMatch(Card prev)
  {
    Card largest = null;
    int largest_index = -1;
    for (int i = 0; i < hand.size(); i++)
    {
      Card card = hand.getCard(i);
      if(cardMatches(card, prev))
      {
        if(largest == null || card.compareTo(largest) > 0)
        {
          largest = card;
          largest_index = i;
        }
        
      }
    }
    if(largest == null)
      return null;
    else
      return hand.popCard(largest_index);
  }
  
  
  
  
}