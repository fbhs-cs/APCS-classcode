public class ExamTwo
{
  public static boolean isOdd(int number)
  {
    if (number % 2 == 0)
      return false;
    return true;
  }
  
  public static void collatz(int number)
  {
    while (number > 1)
    {
      if(isOdd(number))
        number = 3 * number + 1;
      else
        number = number / 2;
      System.out.print(number + " ");
    }
  }
  
}