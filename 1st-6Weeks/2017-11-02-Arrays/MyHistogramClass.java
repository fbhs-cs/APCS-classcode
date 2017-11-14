import java.util.Random;
import java.util.Arrays;

public class MyHistogramClass
{
  public static int[] randomArray(int size)
  {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i< a.length; i++)
    {
      a[i] = random.nextInt(101);
    }
    return a;
  }
  
  public static void printHist(int[] hist)
  {
   for(int i=0; i < hist.length;i++)
   {
    System.out.printf("%d appeared %d times.\n",i,hist[i]); 
   }
  }
  
  public static double avgHist(int[] hist)
  {
    int sum = 0;
    for(int i = 0; i < hist.length; i++)
      sum += i*hist[i];
    int numInHist = 0;
    for(int i = 0; i < hist.length;i++)
      numInHist += hist[i];
    
    System.out.println((double)sum/numInHist);
    return (double)sum/numInHist;
    
  }
  public static void main(String[] args)
  {
    int[] array = randomArray(1000);
    //System.out.println(Arrays.toString(array));
    int[] hist = new int[101];
    for(int n : array)
    {
     hist[n]++; 
    }
    //printHist(hist); 
    avgHist(hist);
  }
  
  
}