public class Date
{
  
  public static void printAmerican(String day, int date, int year, String month)
  {
   System.out.println("American format:");
    System.out.println(day + ", " + month +" "+ date + ", " + year);
  }
  public static void printEuropean(String day, int date, int year, String month)
  {
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
  
  public static void main(String[] args)
  {
    String day = "Friday";
    int date = 29;
    String month = "September";
    int year = 2017;
    printAmerican(day, date, year, month);
    printEuropean(day, date, year, month);
  }
  
}