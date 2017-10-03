public class RecursionDemo2
{
  public static void recFunc(int n)
  {
    System.out.printf("Entered recFunc(%d)",n);
    if (n == 0)
    {
      System.out.println("n == 0, BASE CASE");
    }
    else
    {
      System.out.printf("Calling recFunc(%d)\n",n-1);
      recFunc(n-1);
      System.out.printf("Returned from recFunc(%d)\n",n-1);
    }
  }
  
  public static void main(String[] args)
  {
    recFunc(5);
  }
}