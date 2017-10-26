import java.util.Scanner;

public class MoreLoops
{
  public static double squareRoot(double n)
  {
    double g0 = n / 2;
    double g1 = 0.5 * (g0 + n / g0);
    double diff = Math.abs(g1 - g0);
    while (diff > .0001)
    {
      g0 = g1;  //make prev guess = next guess
      g1 = 0.5 * (g0 + n / g0);
      diff = Math.abs(g1 - g0);
    }
    // System.out.println(diff);
    return g1; 
  }
  
  public static double power(double x, int n)
  {
    double out = 1;
    for (int i = 0; i < n; i++)
      out *= x;
    
    return out;
  }
  
  public static int factorial(int n)
  {
    int out = 1;
    for (int i = 1; i<=n ;i++)
      out *= i;
    
    return out;
  }
  
  public static boolean isPrime(int n)
  {
    if (n == 1 || n == 0)
      return false;
    for(int i=2 ;i<n; i++)
    {
      if (n % i == 0)
        return false;
    }
    return true;
  }
  
  public static int sumPrime(int n)
  {
    int sum = 0;
    for(int i = 2;i<n ; i++)
    {
      if(isPrime(i))
      {
        //System.out.println(i);
        sum += i;
      }
    }
    return sum;
  }
  
  
  
  
  
  
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = 1;
    while (num != 0)
    {
      System.out.print("Enter an integer: ");
      
      num = in.nextInt();
      if(num == 0)
      {
        System.out.println("Thanks!");
        break;
      }
      if(isPrime(num))
        System.out.printf("%d is prime.\n",num);
      else
        System.out.printf("%d is NOT prime.\n",num);
    }
    
  } 
}