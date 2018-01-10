
public class Perfect
{
  private int number;
  
  public Perfect()
  {
    number = 0;
  }
  
  public Perfect(int number)
  {
    this.number = number;
  }
  
  public void setNumber(int number)
  {
    this.number = number;
  }
  
  private boolean isPerfect()
  {
    int sum = 0;
    for(int i = 1;i<this.number;i++)
    {
      if(this.number % i == 0)
        sum += i;
    }
    return sum == this.number;
  }
  
  public String toString()
  {
   if(this.isPerfect())
     return String.format("%d is a perfect number.\n",this.number);
   else
     return String.format("%d is not a perfect number.\n",this.number);
  }
  
}