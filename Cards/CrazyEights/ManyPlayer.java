public class ManyPlayer extends Player
{
  public ManyPlayer(String name)
  {
   super(name); 
  }
    
  @Override
  public Card drawForMatch(Eights eights, Card prev)
  {
    while (true)
    {
      Card card = eights.draw();
      //System.out.println(name + " draws " + card);
      if (cardMatches(card, prev))
      {
        return card;
      }
      hand.addCard(card);
    }
  }
  
}