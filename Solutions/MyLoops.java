public class MyLoops
{
  public static void row5Stars()
  {
    int i = 0;
    while(i < 5)
    {
      System.out.print("*");
      i++;
    }
    System.out.println();
  }
  
  public static void row5Stars2()
  {
    int i = 0;
    do
    {
      System.out.print("*");
      i++;
    }
    while(i < 5);
    System.out.println();
  }
  
  public static void row5Stars3()
  {
    for(int i = 0; i < 5; i++)
      System.out.print("*");
    System.out.println();
  }
  
  public static void rowNStars(int n)
  {
    int i = 0;
    while (i < n)
    {
      System.out.print("*");
      i++;
    }
    System.out.println();
  }
  
  public static void rowNStars2(int n)
  {
    int i = 0;
    do 
    {
      System.out.print("*");
      i++;
    }
    while(i < n);
    System.out.println();
  }
  
  public static void rowNStars3(int n)
  {
    for(int i =0;i<n;i++)
      System.out.print("*");
    System.out.println();
  }
  
  public static void colNStars(int n)
  {
    int i = 0;
    while(i < n)
    {
      System.out.println("*");
      i++;
    }
  }
  
  public static void colNValues(int n)
  {
    int i = 1;
    do
    {
      System.out.println(i);
      i++;
    }
    while(i <= n);
  }
  
  public static void mToNValues(int m, int n)
  {
    for(int i = m; i <= n; i++)
      System.out.print(i + " ");
    System.out.println();
  }
  
  public static void mToNEvens(int m, int n)
  {
    int i = m;
    while (i <= n)
    {
      if(i % 2 == 0)
        System.out.print(i + " ");
      i++;
    }
    System.out.println();
  }
  
  public static void mToNOdds(int m, int n)
  {
    int i = m;
    do
    {
      if(i % 2 == 1)
        System.out.print(i + " ");
      i++;
    }
    while(i <= n);
    System.out.println();
  }
  public static void main(String[] args)
  {
    row5Stars();
    row5Stars2();
    row5Stars3();
    rowNStars(10);
    rowNStars2(10);
    rowNStars3(20);
    colNStars(5);
    colNValues(5);
    mToNValues(5,10);
    mToNEvens(5,10);
    mToNOdds(5,10);
  }
}