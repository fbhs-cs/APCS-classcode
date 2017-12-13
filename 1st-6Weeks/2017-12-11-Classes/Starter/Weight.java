public class Weight
{
  private int ounces;
  private int pounds;
  
  public Weight()
  {}
  
  public Weight(int ounces, int pounds)
  {}
  
  public void printWeight()
  {}
  
  public String toString()
  {return "";}
  
  public int getOunces()
  {return 0;}
  
  public int getPounds()
  {return 0;}
  
  public void setOunces(int ounces)
  {}
  
  public void setPounds(int pounds)
  {}
  
  public Weight add(Weight other)
  {return new Weight();}
  
  // 1 oz = 0.0283495 kg
  public double toKilos()
  {return 0.0;}
  
  
}