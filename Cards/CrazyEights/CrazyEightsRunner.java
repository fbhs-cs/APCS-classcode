public class CrazyEightsRunner
{
  public static void main(String[] args)
  {
    int[] results;
    int p1Score = 0;
    int p2Score = 0;
    int p2Wins = 0;
    //for(int i = 0 ; i< 100; i++)
    //{
      MultiEights game = new MultiEights(4);
      game.playGame();
      //System.out.println("Player:"+results[0]);
      //System.out.println("Genius:"+results[1]);
//      p1Score += results[0];
//      p2Score += results[1];
//      if (results[1] > results[0])
//        p2Wins++;
    //}
    
    System.out.println("Final Scores:");
    System.out.println("Player: " + p1Score);
    System.out.println("Genius: " + p2Score);
    System.out.println("Genius won " + p2Wins + " times.");
    
  }
  
}