public class NestedLoopEx
{
  public static void rowCol(int row, int col)
  {
    for(int r=0;r<row;r++)
    {
      for(int c=0;c<col;c++)
      {
        System.out.printf("(%d, %d) ",r,c);
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args)
  {
    rowCol(5,3);
    
  }
}