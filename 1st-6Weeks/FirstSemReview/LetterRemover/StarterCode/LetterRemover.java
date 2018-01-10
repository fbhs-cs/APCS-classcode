// Save a copy of this file in the parent
// directory (LetterRemover) and remove
// this comment

public class LetterRemover
{
   private String sentence;
   private char lookFor;

 public LetterRemover()
 {
  
 }

 //add in second constructor
 
 
 public void setRemover(String s, char rem)
 {
  sentence = s;
  lookFor = rem;
 }

 public String removeLetters()
 {
  String cleaned=sentence;
  return cleaned;
 }

 public String toString()
 {
  return sentence + " - letter to remove " + lookFor;
 }
}