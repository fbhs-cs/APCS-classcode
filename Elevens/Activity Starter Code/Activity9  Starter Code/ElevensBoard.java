import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {
  
  /**
   * The size (number of cards) on the board.
   */
  private static final int BOARD_SIZE = 9;
  
  /**
   * The ranks of the cards for this game to be sent to the deck.
   */
  private static final String[] RANKS =
  {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
  
  /**
   * The suits of the cards for this game to be sent to the deck.
   */
  private static final String[] SUITS =
  {"spades", "hearts", "diamonds", "clubs"};
  
  /**
   * The values of the cards for this game to be sent to the deck.
   */
  private static final int[] POINT_VALUES =
  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
  
  /**
   * Flag used to control debugging print statements.
   */
  private static final boolean I_AM_DEBUGGING = false;
  
  
  /**
   * Creates a new <code>ElevensBoard</code> instance.
   */
  public ElevensBoard() {
    super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
  }
  
  /**
   * Determines if the selected cards form a valid group for removal.
   * In Elevens, the legal groups are (1) a pair of non-face cards
   * whose values add to 11, and (2) a group of three cards consisting of
   * a jack, a queen, and a king in some order.
   * @param selectedCards the list of the indices of the selected cards.
   * @return true if the selected cards form a valid group for removal;
   *         false otherwise.
   */
  @Override
  public boolean isLegal(List<Integer> selectedCards) {
    if (selectedCards.size() > 3)
      return false;
    
    if (selectedCards.size() == 2) 
    {
      return containsPairSum11(selectedCards);
    }
    
    else
      return containsJQK(selectedCards);
    
  }
  
  /**
   * Determine if there are any legal plays left on the board.
   * In Elevens, there is a legal play if the board contains
   * (1) a pair of non-face cards whose values add to 11, or (2) a group
   * of three cards consisting of a jack, a queen, and a king in some order.
   * @return true if there is a legal play left on the board;
   *         false otherwise.
   */
  @Override
  public boolean anotherPlayIsPossible() {
    List<Integer> onBoard = cardIndexes();
    for(int i = 0; i < onBoard.size()-1;i++)
    {
      List<Integer> selected = new ArrayList<Integer>();
      selected.add(onBoard.get(i));
      for(int j = 0; j < onBoard.size();j++)
      {
        selected.add(onBoard.get(j));
        if(containsPairSum11(selected))
          return true;
        selected.remove(selected.size()-1);
      }
    }
    
    boolean isJack = false;
    boolean isQueen = false;
    boolean isKing = false;
    for(Integer i : onBoard)
    {
      if(cardAt(i).rank().equals("jack"))
        isJack = true;
      else if(cardAt(i).rank().equals("queen"))
        isQueen = true;
      else if(cardAt(i).rank().equals("king"))
        isKing = true;
    }
    return isJack && isQueen && isKing;
  }
  
  /**
   * Check for an 11-pair in the selected cards.
   * @param selectedCards selects a subset of this board.  It is list
   *                      of indexes into this board that are searched
   *                      to find an 11-pair.
   * @return true if the board entries in selectedCards
   *              contain an 11-pair; false otherwise.
   */
  private boolean containsPairSum11(List<Integer> selectedCards) {
    if(cardAt(selectedCards.get(0)).pointValue() + cardAt(selectedCards.get(1)).pointValue() == 11)
      return true;
    return false;
  }
  
  /**
   * Check for a JQK in the selected cards.
   * @param selectedCards selects a subset of this board.  It is list
   *                      of indexes into this board that are searched
   *                      to find a JQK group.
   * @return true if the board entries in selectedCards
   *              include a jack, a queen, and a king; false otherwise.
   */
  private boolean containsJQK(List<Integer> selectedCards) {
    String c0 = cardAt(selectedCards.get(0)).rank();
    String c1 = cardAt(selectedCards.get(1)).rank();
    String c2 = cardAt(selectedCards.get(2)).rank();
    if (!c0.equals(c1) && !c1.equals(c2) && !c2.equals(c0))
    {
      if(c0.equals("jack") || c0.equals("queen") || c0.equals("king"))
      {
        if(c1.equals("jack") || c1.equals("queen") || c1.equals("king"))
        {
          if(c2.equals("jack") || c2.equals("queen") || c2.equals("king"))
            return true;
        }
      }
    }
    return false;
  }
}
