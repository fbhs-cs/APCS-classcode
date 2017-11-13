import java.util.Random;
import java.util.Arrays;
public class ArrayDemo2
{
  /**
   * Creates an integer array with elements
   * between 0 and 99.
   * @param size the length of the array
   * @return an integer array
   */
  public static int[] randomArray(int size)
  {
    Random random = new Random();
    int[] a = new int[size];
    for(int i = 0; i< a.length; i++)
    {
      a[i] = random.nextInt(100); 
    }
    return a;
  }
  
  /**
   * Prints out the array
   * @param array the array to be printed
   */
  public static void printArray(int[] array)
  {
   System.out.print("{"+array[0]);
    for(int i = 1; i < array.length;i++)
    {
      System.out.print(", " + array[i]);
    }
    System.out.println("}");
  }
  
  public static void main(String[] args)
  {
    
    int numValues = 8;
    int[] firstArray = randomArray(numValues);
    System.out.print("Original: ");
    //using printArray to print
    printArray(firstArray);
    
    //make a copy of the array
    int[] secondArray = Arrays.copyOf(firstArray, numValues);
    System.out.print("Copy:     ");
    printArray(secondArray);
    
    System.out.println();
    
    //sort the elements in the copy
    Arrays.sort(secondArray);
    System.out.print("Sorted:   ");
    
    //using Arrays toString method to print
    System.out.println(Arrays.toString(secondArray));
    System.out.print("Original: ");
    System.out.println(Arrays.toString(firstArray));
    System.out.println();
    
    int[] a = {1, 2, 3, 4};
    printArray(a);
    
    
  }
}