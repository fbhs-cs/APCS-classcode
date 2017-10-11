public class RecursionEx
{
  public static int factorial(int n)
  {
    if (n == 0)
      return 1;
    else
    {
      int recurse = n * factorial( n - 1 );
      return recurse;
    }
  }
  
  public static int fib(int n)
  {
    if (n == 1 || n == 2)
      return 1;
    else
    {
      int recurse = fib(n-1) + fib(n-2);
      return recurse;
    }
  }
  
  public static void main(String[] args)
  {
    int factNum = 9;
    int factResult = factorial(factNum);
    System.out.printf("%d! = %d\n",factNum,factResult);
    
    int fibNum = 9;
    int fibResult = fib(fibNum);
    System.out.printf("fib(%d) = %d\n",fibNum, fibResult);
  }
}