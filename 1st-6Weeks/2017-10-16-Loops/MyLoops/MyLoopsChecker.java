public class MyLoopsChecker
{
  
  public static void main(String[] args)
  {
    System.out.println("#1 Expected:");
    System.out.println("*****");
    System.out.println("#1 Yours:");
    MyLoops.row5Stars();
    System.out.println();
    System.out.println("#2 Expected:");
    System.out.println("*****");
    System.out.println("#2 Yours:");
    MyLoops.row5Stars2();
    System.out.println();
    System.out.println("#3 Expected:");
    System.out.println("*****");
    System.out.println("#3 Yours:");
    MyLoops.row5Stars3();
    System.out.println();
    System.out.println("#4 Expected:");
    System.out.println("**********");
    System.out.println("#4 Yours:");
    MyLoops.rowNStars(10);
    System.out.println();
    System.out.println("#5 Expected:");
    System.out.println("**********");
    System.out.println("#5 Yours:");
    MyLoops.rowNStars2(10);
    System.out.println();
    System.out.println("#6 Expected:");
    System.out.println("**********");
    System.out.println("#6 Yours:");
    MyLoops.rowNStars3(10);
    System.out.println();
    System.out.println("#7 Expected:");
    System.out.println("*\n*\n*\n");
    System.out.println("#7 Yours:");
    MyLoops.colNStars(3);
    System.out.println();
    System.out.println("#8 Expected:");
    System.out.println("1\n2\n3\n4\n");
    System.out.println("#8 Yours:");
    MyLoops.colNValues(4);
    System.out.println();
    System.out.println("#9 Expected:");
    System.out.println("2 3 4");
    System.out.println("#9 Yours:");
    MyLoops.mToNValues(2,4);
    System.out.println();
    System.out.println("#10 Expected:");
    System.out.println("2 4 6 8 10");
    System.out.println("#10 Yours:");
    MyLoops.mToNEvens(1,10);
    System.out.println();
    System.out.println("#11 Expected:");
    System.out.println("1 3 5 7 9");
    System.out.println("#11 Yours:");
    MyLoops.mToNOdds(1,10);
    
  }
}
    