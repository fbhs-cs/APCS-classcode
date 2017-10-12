import java.util.Scanner;

public class DecToBase
{
  public static void main(String[] arg)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("What decimal number? ");
    int num = in.nextInt();
    System.out.print("What base do you want (2-9)?");
    int base = in.nextInt();
    convert(base, num);
  }
  public static void convert(int base, int num)
  {
    if (num == 0)
    {
      return;
    }
    else 
    {
      int newNum = num/base;
      convert(base, newNum);
      System.out.print(num%base);
    }
    
  }
}