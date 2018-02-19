public class DeckHandTester
{
  public static void main(String[] args)
  {
   Deck deck = new Deck("deck");
   deck.shuffle();
   System.out.println(deck);
   deck.sortCards();
   System.out.println(deck);
//   Hand hand = new Hand("hand");
//   deck.deal(hand, 7);
//   hand.display();
//   Hand drawPile = new Hand("Draw Pile");
//   deck.dealAll(drawPile);
//   System.out.printf("Cards in drawPile: %d",drawPile.size());
  }
}