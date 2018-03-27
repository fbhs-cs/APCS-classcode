/**
 * This class provides a convenient way to test shuffling methods.
 */
import java.util.Arrays;
public class Shuffler {

 /**
  * The number of consecutive shuffle steps to be performed in each call
  * to each sorting procedure.
  */
 private static final int SHUFFLE_COUNT = 2;


 /**
  * Tests shuffling methods.
  * @param args is not used.
  */
 public static void main(String[] args) {
  System.out.println("Results of " + SHUFFLE_COUNT +
         " consecutive perfect shuffles:");
  int[] values1 = {0, 1, 2, 3,4,5,6};
  for (int j = 1; j <= SHUFFLE_COUNT; j++) {
   perfectShuffle(values1);
   System.out.print("  " + j + ":");
   for (int k = 0; k < values1.length; k++) {
    System.out.print(" " + values1[k]);
   }
   System.out.println();
  }
  System.out.println();

  System.out.println("Results of " + SHUFFLE_COUNT +
         " consecutive efficient selection shuffles:");
  int[] values2 = {0, 1, 2, 3,4,5,6};
  for (int j = 1; j <= SHUFFLE_COUNT; j++) {
   selectionShuffle(values2);
   System.out.print("  " + j + ":");
   for (int k = 0; k < values2.length; k++) {
    System.out.print(" " + values2[k]);
   }
   System.out.println();
  }
  System.out.println();
  
  System.out.println("Testing flip()...");
  int NUM_FLIPS = 100;
  int num_heads = 0;
  for(int i = 0; i < NUM_FLIPS; i++)
  {
    if(flip().equals("heads"))
      num_heads++;
  }
  System.out.println("Total flips: " + NUM_FLIPS);
  System.out.printf("Heads: %d\tTails: %d\n",num_heads,NUM_FLIPS-num_heads);
  System.out.println();
  
  System.out.println("Testing arePermutations()...");
  int[] a = {1,2,3,4};
  int[] b = {4,3,2,1};
  int[] c = {1,3,5,7};
  System.out.println("a: " + Arrays.toString(a));
  System.out.println("b: " + Arrays.toString(b));
  System.out.println("c: " + Arrays.toString(c));
  if(arePermutations(a,b))
    System.out.println("a and b are permutations.");
  else
    System.out.println("a and b are NOT permutations.");
  
  if(arePermutations(a,c))
    System.out.println("a and c are permutations.");
  else
    System.out.println("a and c are NOT permutations.");
  
 }


 /**
  * Apply a "perfect shuffle" to the argument.
  * The perfect shuffle algorithm splits the deck in half, then interleaves
  * the cards in one half with the cards in the other.
  * @param values is an array of integers simulating cards to be shuffled.
  */
 public static void perfectShuffle(int[] values) {
  int[] shuffled = new int[values.length];
  int k = 0;
  for (int j =0; j<(values.length+1)/2;j++)
  {
    shuffled[k] = values[j];
    k += 2;
  }
  k = 1;
  for (int j=(values.length+1)/2; j<values.length;j++)
  {
    shuffled[k] = values[j];
    k += 2;
  }
  
  for (int i = 0; i<shuffled.length; i++)
    values[i] = shuffled[i];
  
 }

 /**
  * Apply an "efficient selection shuffle" to the argument.
  * The selection shuffle algorithm conceptually maintains two sequences
  * of cards: the selected cards (initially empty) and the not-yet-selected
  * cards (initially the entire deck). It repeatedly does the following until
  * all cards have been selected: randomly remove a card from those not yet
  * selected and add it to the selected cards.
  * An efficient version of this algorithm makes use of arrays to avoid
  * searching for an as-yet-unselected card.
  * @param values is an array of integers simulating cards to be shuffled.
  */
 public static void selectionShuffle(int[] values) {
  for (int k = values.length-1; k>=1;k--)
  {
    int r = (int)((k+1) * Math.random());
    int temp = values[r];
    values[r] = values[k];
    values[k] = temp;
  }
   
 }
 
 public static String flip()
 {
   double r = Math.random();
   if (r < 0.333)
     return "tails";
   return "heads";
 }
 
 
 public static boolean arePermutations(int[] arr1, int[] arr2)
 {
   boolean found;
   for (int n:arr1)
   {
     found = false;
     for (int m: arr2)
     {
       if (n == m)
       {
         found = true;
         break;
       }
     }
     if (!found)
       return false;
   }
   return true;
 }
 
 
 
 
 
 
}
