public class StringDemo
{
 public static void main(String[] args)
 {
   String word = "Hello, world!";
   for(int i = 0; i < word.length(); i++)
     System.out.print(word.charAt(i) + " ");
   System.out.println();
   
   for(int i = word.length()-1;i >= 0; i--)
     System.out.print(word.charAt(i));
   System.out.println();
   
   
   
 }
  
}