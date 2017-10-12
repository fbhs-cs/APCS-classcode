import java.util.Scanner;


public class StoHMS
{
  public static void main(String[] args)
  {
    String line;
    Scanner input = new Scanner(System.in);
   
    System.out.print("How many seconds? ");
    int inSec = input.nextInt(); 
    int minutes = inSec/60;
    int hours = minutes/60;
    int minute = minutes%60;
    int seconds = inSec%60;
    
    System.out.printf( " %d seconds = %d hours, %d minutes, and %d seconds",inSec,hours,minute,seconds);
      
   
    
    
    
    
    
    
    
  }
}