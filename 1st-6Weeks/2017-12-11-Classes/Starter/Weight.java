/**
 * The weight of an object in pounds and ounces.
 *  
 * A Weight object should not have an ounces value
 * greater than 15.  
 * 
 * For example, 3 pounds, 18 ounces should be stored
 * as 4 pounds, 2 ounces.
 */
public class Weight
{
  private int ounces;
  private int pounds;
  
  /**
   * Default constructor, creates a Weight object with 
   * ounces and pounds set to 0.
   */
  public Weight()
  {}
  
  
  /**
   * Create a VALID Weight object based on specified values.
   *
   */
  public Weight(int pounds, int ounces)
  {}
  
  /**
   * Displays the values of the Weight object:
   *  For example: 5 lb, 10 oz
   */
  public void printWeight()
  {}
  
  /**
   * Returns a String representation of this weight object.
   *  For example: 5 lb, 10 oz
   * @return a String representation of this Weight object.
   */
  public String toString()
  {return "";}
  
  /**
   * Returns the value of the ounces instance variable of this Weight object
   * @return the value of the ounces instance variable of this Weight object
   */
  public int getOunces()
  {return 0;}
  
  /**
   * Returns the value of the pounds instance variable of this Weight object
   * @return the value of the pounds instance variable of this Weight object
   */
  public int getPounds()
  {return 0;}
  
  /**
   * Sets the value of the ounces instance variable of the Weight object
   * @param ounces an integer representing the number of ounces
   */
  public void setOunces(int ounces)
  {}
  
  /**
   * Sets the value of the pounds instance variable of the Weight object
   * @param pounds an integer representing the number of pounds
   */
  public void setPounds(int pounds)
  {}
  
  /**
   * Adds two Weight objects together and ensures that the output is a 
   * valid Weight object.
   * @param other a Weight object
   * @return a new Weight object that is the sum of this Weight and the other Weight.
   */
  public Weight add(Weight other)
  {return new Weight();}
  
  /**
   * Converts the Weight object into kilograms
   * 1 oz = 0.0283495 kg
   * @return a double representing the weight of this object in kilograms.
   */
  public double toKilos()
  {return 0.0;}
  
  
}