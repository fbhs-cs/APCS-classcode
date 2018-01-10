// Save a copy of this file in the parent
// directory (LetterRemover) and remove
// this comment



public class LetterRemoverRunner
{
  public static void main( String args[] )
  {
    // uncomment below this line once you have the LetterRemover
    // class methods written
    
    LetterRemover message = new LetterRemover("I am Sam I am",'a');
    System.out.println(message);
    message.setRemover("ssssssssxssssesssssesss",'s');
    System.out.println(message);
    message.setRemover("qwertyqwertyqwerty",'a');
    System.out.println(message);
    message.setRemover("abababababa",'b');
    System.out.println(message);
    message.setRemover("abaababababa",'x');
    System.out.println(message);         
  }
}