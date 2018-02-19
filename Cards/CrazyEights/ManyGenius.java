public class ManyGenius extends ManyPlayer
{
  public ManyGenius(String name)
  {
    super(name);
  }
  
  @Override
  public Card play(Eights eights, Card prev)
  {
    Card card = searchForMatch(prev);
    if (card == null)
    {
      card = drawForMatch(eights, prev);
    }
    return card;
  }
  
  @Override
  public Card searchForMatch(Card prev)
  {
    Card largest = null;
    int largest_index = -1;
    int eight_index = -1;
    for (int i = 0; i < hand.size(); i++)
    {
      Card card = hand.getCard(i);
      if(cardMatches(card, prev))
      {
        if(largest == null || card.compareTo(largest) > 0)
        {
          if(card.getRank() == 8)
            eight_index = i;
          else {
            largest = card;
            largest_index = i;
          }
        }
      }
    }
    if(largest == null && eight_index == -1)
      return null;
    else if (largest == null)
      return hand.popCard(eight_index);
    else
      return hand.popCard(largest_index);
  }
  

  
  
}