public class FreeResponse1
{
  
  /** Sample solution to part A 
    * Displays the discounted price of an item
    * 
    * @param price the original price of an item
    * @param discount the discount percentage as a decimal
    */
  public static void findDiscountedPrice(double price, double discount)
  {
    double discPercent = discount * 100;
    double discPrice = price - price * discount;
    System.out.printf("Original: $%.2f, Discount: %.2f%%, Final: $%.2f\n",price,discPercent,discPrice);
  }
  
  /** Sample solution to part B 
    * Displays the sale price of an item during a specific sale
    * 
    * @param itemPrice the original price of an item
    */
  public static void findSalePrice(double itemPrice)
  {
    if(itemPrice >= 100)
    {
      findDiscountedPrice(itemPrice,0.40);
    }
    else if(itemPrice >= 50)
    {
      findDiscountedPrice(itemPrice,0.30);
    }
    else
    {
      findDiscountedPrice(itemPrice,0.20);
    }
  }
  
  
  public static void main(String[] args)
  {
    findSalePrice(500);
    findSalePrice(85.99);
    findSalePrice(34.99);
  }
  
  
  
}