import java.util.Arrays;

public class StringTraversalDemo
{ 
  /**
   * reverses a string
   * @param str a String
   * @return str in reverse order
   */
  public static String reverse(String str)
  {
    String out = "";
    for(int i = str.length()-1; i >= 0; i--)
    {
     out = out + str.charAt(i);
    }
    return out;
  }
  
  /**
   * counts the number of times each character
   * appears in a given string
   * @param str a String
   * @return an array of ints with a->0 and z->25
   *         representing the number times each 
   *         char appears in str
   */
  public static int[] countChars(String str)
  {
    int[] counts = new int[26];
    String tempStr = str.toLowerCase();
    for(int i = 0; i < tempStr.length();i++)
    {
     char c = tempStr.charAt(i);
     int index = c - 'a';
     counts[index]++;
    }
    return counts;
  }
  
  public static void main(String[] args)
  {
    int[] temp = countChars("Hello");
    System.out.println(Arrays.toString(temp));
  }
  
}