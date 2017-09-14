/**
 * In-class demonstration of data types 
 */
public class TypeDemo
{
  public static void main(String[] args)
  {
    //primative data types
    int anInt;          //32-bit integer
    boolean aBool;      //true or false
    short aShort;       //16-bit integer
    long aLong;         //64-bit integer
    byte aByte;         //8-bit integer
    double aDouble;     //64-bit floating point number
    float aFloat;       //32-bit floating point
    char aChar;         //a character
    
    anInt = 42;
    System.out.println("anInt="+anInt); //concatenation
    aBool = 
    //reference data types
    String aString;          //strings are IMMUTABLE
    aString = "Willy von Hamerschmidt";
    System.out.println(aString.toUpperCase());
    System.out.println(aString.toLowerCase());
    System.out.println(aString);
    String bString = aString.toUpperCase();
    System.out.println(bString);
  }
}