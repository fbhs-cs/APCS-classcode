public class NestedLoops
{
  public static void main(String[] args)
{
    box(10,5);
    triangle(10);
    reverseTri(10);
    pyramid(10);
    invertedPyramid(10);
    hollowBox(10,12);
    checkers(10,12);
  }
  
  public static void box(int row, int col)
  {
    for (int r = 0; r < row; r++)
    {
      for (int c = 0; c < col; c++)
        System.out.print("*");
      System.out.println();
  }
}
  public static void triangle(int side)
  {
    for (int r = 0; r < side; r++)
    {
      for (int c = 0; c <= r; c++)
        System.out.print("*");
      System.out.println();
}
  }
  public static void reverseTri(int side)
  {
    for (int r =0; r < side; r++)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= r; c++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void pyramid(int side)
  {
    for (int r = 0; r < side; r++)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void invertedPyramid(int side)
  {
    for (int r = side - 1; r >= 0; r--)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void hollowBox(int row, int col)
  {
    for (int r = 0; r < row; r++)
    {
      for (int c = 0; c < col; c++)
      {
        if(r==0 || c==0 || r==row-1 || c==col-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void checkers(int row, int col)
  {
    for (int r = 0; r < row; r++)
    {
      for (int c = 0; c < col; c++)
      {
        if((r+c)%2==0)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}