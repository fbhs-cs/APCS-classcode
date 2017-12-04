import java.util.Arrays;

public class StringUtils
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
     if(c >= 'a' && c <= 'z')
     {
       int index = c - 'a';
       counts[index]++;
     }
    }
    return counts;
  }
  
  public static boolean isPalindrome(String str)
  {
    return str.equals(reverse(str));
  }
  
  public static boolean isDoubloon(String str)
  {
   int[] counts = countChars(str);
    for(int count: counts)
    {
      if (count != 0 && count != 2)
        return false;
    }
    return true;
  }
  
  public static boolean areAnagrams(String str1, String str2)
  {
   int[] counts1 = countChars(str1);
   int[] counts2 = countChars(str2);
   for(int i =0; i < counts1.length;i++)
   {
    if(counts1[i] != counts2[i])
      return false;
   }
   return true;
  }
  
  public static boolean canSpell(String tiles, String word)
  {
   int[] tileCounts = countChars(tiles);
   int[] wordCounts = countChars(word);
   for(int i = 0;i<tileCounts.length;i++)
   {
     if (tileCounts[i] < wordCounts[i])
        return false;
  
   }
   return true;
  }
  
  public static void main(String[] args)
  {
    System.out.println(canSpell("quijibo","jibus"));
  }
  
}