public class Temp
{
 public static int factorial(int n)
 {
  int fact = 1;
  for(int i = 1; i <= n; i++)
    fact *= i;
  return fact;
 }
 
 public static void main(String[] args)
 {
  for(int i = 1; i <= 30; i++)
    System.out.printf("%2d! = %d\n",i,factorial(i));
 }
}