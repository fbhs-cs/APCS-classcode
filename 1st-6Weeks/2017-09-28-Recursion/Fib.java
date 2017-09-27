public class Fib
{
  
  public static int fib(int fibNum)
  {
   if(fibNum < 0)
   {
     System.out.println("Error: Cannot find a negative Fibonacci number!");
     return -1;
   }
   else if(fibNum == 0)
   {
     return 0;
   }
   else if(fibNum == 1)
   { 
     return 1;
   }
   else
   {
     return fib(fibNum - 1) + fib(fibNum - 2);
   }
  }
  
  public static void main(String[] args)
  {
    for(int i = 0;i < 30;i++)
    {
      System.out.print(fib(i)+" ");
    }
  }
}