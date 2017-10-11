/** A program that displays whether or not 
  * a particular year is a leap year.
  */
public class LeapYearWorking
{
  
  /**Displays whether or not year is a leapyear.
    * This is based on the Gregorian calendar, 
    * so it only works for years after 1582
    *
    * @param year a year after 1582
    */
  public static void isLeapYear(int year) 
  {
    if (year < 1582)
    {
      System.out.println("ERROR: This only applies to years AFTER 1582!");
      return;
    }
    
    boolean leapFlag;
    leapFlag = ( (year % 4 == 0 && year % 100 != 0)
                  || (year % 4 == 0 && year % 400 == 0) );
    
    if( leapFlag )
    {
      System.out.printf("%d is a leap year.\n",year);
    }
    else
    {
      System.out.printf("%d is NOT a leap year!\n",year);
    }
  }

  
  public static void main(String[] args)
  {
    isLeapYear(1900);
    isLeapYear(2000);
    isLeapYear(1962);
    isLeapYear(2017);
    isLeapYear(1492);
    isLeapYear(2016);
  }
}