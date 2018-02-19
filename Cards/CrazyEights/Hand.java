public class Hand extends CardCollection
{
  public Hand(String label)
  {
    super(label);
  }
  
  public void display()
  {
    System.out.println(getLabel() + ": ");
    for(int i = 0; i < size(); i++)
    {
      System.out.println(getCard(i));
    }
    System.out.println();
  }
  

  
  public void displayLast()
  {
    System.out.println(getLabel() + ": ");
    System.out.println(getCard(size()-1));
    System.out.println();
  }
}