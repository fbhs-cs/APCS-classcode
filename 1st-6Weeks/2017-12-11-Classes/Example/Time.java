public class Time
{
  // instance variables 
  private int hour;
  private int minute;
  private double second;
  
  //DEFAULT CONSTRUCTOR
  public Time()
  {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }
    //VALUE CONSTRUCTOR
  public Time(int hour, int minute, double second)
  {
   this.hour = hour;
   this.minute = minute;
   this.second = second;
  }
  
  // accessor methods --- getter methods
  public int getHour()
  {
   return this.hour; 
  }
  
  public int getMinute()
  {
    return this.minute;
  }
  
  public double getSecond()
  {
    return this.second;
  }
  
  // mutators --- setters
  public void setHour(int hour)
  {
    this.hour = hour;
  }
  
  public void setMinute(int minute)
  {
    this.minute = minute;
  }
  
  public void setSecond(double second)
  {
    this.second = second;
  }
  /*
  public static void printTime(Time t)
  {
   System.out.printf("%d:%d:%.2f\n",t.hour,t.minute,t.second); 
  }
  
  public void dispTime()
  {
    System.out.printf("%d:%d:%.2f\n",this.hour,this.minute,this.second);
  }
  */
  public String toString()
  {
   return String.format("%02d:%02d:%04.1f",
                        this.hour, this.minute,
                        this.second);
  }
  
  public boolean equals(Time that)
  {
    return this.hour == that.hour 
      &&   this.minute == that.minute 
      &&   this.second == that.second;  
  }
  
  // Add is an example of a "pure" method: 
  // it does not change
  // the object or the parameters.
  public Time add(Time that)
  {
    int newHour = this.hour + that.hour;
    int newMinute = this.minute + that.minute;
    double newSec = this.second + that.second;
    if (newSec >= 60)
    {
     newMinute++;
     newSec -= 60;
    }
    
    if (newMinute >= 60)
    {
      newHour++;
      newMinute -= 60;
    }
    
    if (newHour >= 24)
    {
      newHour -= 24;
    }
    
    return new Time(newHour,newMinute,newSec);
  }
  
  // increment is an example of a "modifier"
  public void increment(double seconds)
  {
    int tempMin = (int)seconds / 60;
    double tempSec = seconds % 60;
    this.second += tempSec;
    this.minute += tempMin;
    if (this.second >= 60)
    {
      this.minute++;
      this.second -= 60;
    }
    if (this.minute >= 60)
    {
      this.hour++;
      this.minute -= 60;
    }
    
  }
  
  
}