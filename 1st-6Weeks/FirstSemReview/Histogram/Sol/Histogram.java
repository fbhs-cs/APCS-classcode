// Save a copy of this file in the parent
// directory (Histogram) and remove
// this comment


public class Histogram
{
  private int[] numCount;
  
  public Histogram(int[] list)
  {
    this.setHist(list); 
  }
  
  //set method 
  public void setHist(int[] list)
  {
    numCount = new int[10];
    for(int i:list)
    {
      if(i >= 0 && i <= 9)
      {
        numCount[i]++;
      }
    }
  }
  
  //toString method
  public String toString()
  {
    String out = "";
    for(int i = 0; i < numCount.length; i++)
    {
      out += String.format("%d - %d\n",i,numCount[i]);
    }
    return out;
  }
}