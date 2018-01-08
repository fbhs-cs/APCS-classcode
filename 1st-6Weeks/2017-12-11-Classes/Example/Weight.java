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
  {
    this.ounces = 0;
    this.pounds = 0;
  }
  
  
  /**
   * Create a VALID Weight object based on specified values.
   *
   */
  public Weight(int pounds, int ounces)
  {
    pounds += ounces / 16;
    ounces = ounces % 16;
    this.pounds = pounds;
    this.ounces = ounces;
  }
  
  /**
   * Displays the values of the Weight object:
   *  For example: 5 lb, 10 oz
   */
  public void printWeight()
  {
    System.out.printf("%d lb, %d oz\n",this.pounds,this.ounces);
  }
  
  /**
   * Returns a String representation of this weight object.
   *  For example: 5 lb, 10 oz
   * @return a String representation of this Weight object.
   */
  public String toString()
  {return String.format("%d lb, %d oz",this.pounds,this.ounces);}
  
  /**
   * Returns the value of the ounces instance variable of this Weight object
   * @return the value of the ounces instance variable of this Weight object
   */
  public int getOunces()
  {return this.ounces;}
  
  /**
   * Returns the value of the pounds instance variable of this Weight object
   * @return the value of the pounds instance variable of this Weight object
   */
  public int getPounds()
  {return this.pounds;}
  
  /**
   * Sets the value of the ounces instance variable of the Weight object
   * @param ounces an integer representing the number of ounces
   */
  public void setOunces(int ounces)
  {
    this.pounds += ounces / 16;
    ounces = ounces % 16;
    this.ounces = ounces;
  }
  
  /**
   * Sets the value of the pounds instance variable of the Weight object
   * @param pounds an integer representing the number of pounds
   */
  public void setPounds(int pounds)
  {this.pounds = pounds;}
  
  /**
   * Adds two Weight objects together and ensures that the output is a 
   * valid Weight object.
   * @param other a Weight object
   * @return a new Weight object that is the sum of this Weight and the other Weight.
   */
  public Weight add(Weight other)
  {
    int sumPounds = this.pounds + other.pounds;
    int sumOunces = this.ounces + other.ounces;
    return new Weight(sumPounds,sumOunces);
  }
  
  /**
   * Converts the Weight object into kilograms
   * 1 oz = 0.0283495 kg
   * @return a double representing the weight of this object in kilograms.
   */
  public double toKilos()
  {
    final double KG_IN_OZ = 0.0283495;
    int ounces = this.ounces + 16 * this.pounds;
    return KG_IN_OZ * ounces;
  }
  
  
}