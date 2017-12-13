public class TimeRunner
{
  public static void main(String[] args)
  {
    Time start = new Time(11,18,40);
    System.out.println("Before:"+start);
    start.increment(145);
    System.out.println("After:"+start);
    
  }
}