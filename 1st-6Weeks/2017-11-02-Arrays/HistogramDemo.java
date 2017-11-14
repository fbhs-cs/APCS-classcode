import java.util.Random;
import java.util.Arrays;

public class HistogramDemo
{
  /**
   * Finds the number of elements in an array
   * that are between low and high
   * @param a an integer array
   * @param low the lower bound
   * @param high the upper bound
   * @return the number of values in a that are greater than or equal to low and less than high
   */
  public static int inRange(int[] a, int low, int high)
  {
    int count = 0;
    for (int i = 0; i < a.length; i++)
    {
      //uncomment to understand why the second way of counting is inefficient
      System.out.print(a[i]);
      if (a[i] >= low && a[i] < high)
        count++;
    }
      System.out.println();
    return count;
    
  }
  
  
  
  public static void main(String[] args)
  {
    int[] scores = ArrayDemo2.randomArray(30);
    int a = inRange(scores,90,100);;
    int b = inRange(scores,80,90);
    int c = inRange(scores,70,80);
    int d = inRange(scores,60,70);
    int f = inRange(scores,0,60);
    
    System.out.printf("As: %d\tBs: %d\tCs: %d\tDs: %d\tFs: %d\n",a,b,c,d,f);
    
    // not very efficient. For lots of scores this would take a while!
    int[] counts = new int[100];
    for(int i = 0; i < counts.length; i++)
    {
      counts[i] = inRange(scores,i,i+1);
    }
    System.out.println(Arrays.toString(counts));
    
    

    // MUCH more efficient!
    int[] effCounts = new int[100];
    for(int i = 0; i < scores.length;i++)
    {
      int index = scores[i];
      effCounts[index]++;
    }
    System.out.println(Arrays.toString(effCounts));
    
                        
  }
  
}