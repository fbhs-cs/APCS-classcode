public class NestedLoopsInClass
{
  /**
   * Displays a box star pattern
   * @param row the number of rows in the box star
   * @param col the number of columns in the box star
   */
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
    for (int r = 0; r < side; r++)
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
  
   public static void reflectedPyramid(int side)
  {
    for (int r = 0; r < side; r++)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
    System.out.println();
    for (int r = side - 1; r >= 0; r--)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
  }
   
   public static void hourGlass(int side)
  {
    for (int r = side - 1; r >= 0; r--)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
    for (int r = 0; r < side; r++)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
  }
  
   public static void diamond(int side)
  {
    for (int r = 0; r < side; r++)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
    
    for (int r = side - 2; r >= 0; r--)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      for (int c = 0; c <= 2*r; c++)
        System.out.print("*");
      System.out.println();
    }
  }
   
     public static void doubleBorderBox(int row, int col)
  {
    for (int r = 0; r < row; r++)
    {
      for (int c = 0; c < col; c++)
      {
        if(r==0 || c==0 || r==row-1 || c==col-1 
             || r==row-2 || c==col-2 || r==1 || c==1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
   
     
     public static void hollowDiamond(int side)
  {
    for (int r = 0; r < side; r++)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      
        System.out.print("*");
      for (int c = 0; c <= 2*r; c++)
      {
        
        if (c == 2*r-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    
    for (int r = side - 2; r >= 0; r--)
    {
      for (int c = side - 1; c > r; c--)
        System.out.print(" ");
      System.out.print("*");
      for (int c = 0; c <= 2*r; c++)
      {
        if (c == 2*r-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args)
  {
    hollowDiamond(8);
  }
}