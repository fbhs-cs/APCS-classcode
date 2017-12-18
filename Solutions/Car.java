public class Car
{
  private String make;
  private String model;
  private int year;
  
  public Car(String make, String model, int year)
  {
    this.make = make;
    this.model = model;
    this.year = year;
  }
  
  public static void printCar(Car car)
  {
    System.out.print(car.year + " " + car.make + " " + car.model ); 
  }
  
  public static void testCar()
  {
    Car fm = new Car("Ford","Mustang",1966);
    printCar(fm);
  }
  
  public String toString()
  {
    return year + " " +make + " " + model  ; 
  }
  
  public boolean equals(Car other)
  {
    return this.make.equals(other.make) 
      &&  this.model.equals(other.model)  
      && this.year == other.year;
  }
  
  public String getMake()
  { return this.make; }
  
  public String getModel()
  { return this.model; }
  
  public int getYear()
  { return this.year; }
  
  public void setMake(String make)
  { this.make = make; }
  
  public void setModel(String model)
  { this.model = model; }
  
  public void setYear(int year)
  { this.year = year; }
  
  
  
}