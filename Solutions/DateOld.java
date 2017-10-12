public class DateOld
{
  public static void main(String[] args)
  {
    /*Part 1
    System.out.print("Hello, world");
    */
    /*Part 2
    String day="Tuesday";
    int date=19;
    String month="September";
    int year=2017;
    */
    String day="Tuesday";
    int date=19;
    String month="September";
    int year=2017;
   /* Part 3
    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    */
    String American=day + ", " + month + " " +date + ", " + year;
    String European=day + " " + date + " " + month + " " + year;
    System.out.println("American format:");
      System.out.println(American);
      System.out.println("European format:");
      System.out.println(European);
  }
}