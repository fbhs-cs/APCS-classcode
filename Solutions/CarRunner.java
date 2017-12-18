public class CarRunner
{
 public static void main(String[] args)
 {
   System.out.println("Making cars...\n");
   Car c1 = new Car("Dodge","Charger",1970);
   Car.printCar(c1);
   System.out.println();
   Car c2 = new Car("Dodge","Charger",1970);
   Car.printCar(c2);
   System.out.println();
   Car c3 = new Car("Dodge","Viper",2014);
   Car.printCar(c3);
   System.out.println();
   Car c4 = new Car("Ford","Charger",1970);
   Car.printCar(c4);
   System.out.println();
   Car c5 = new Car("Chevrolet","Camaro",1970);
   Car.printCar(c5);
   System.out.println();
   
   
   System.out.println();   
   
   System.out.println("Testing toString():");
   System.out.println(c1);
   System.out.println(c2);
   System.out.println(c3);
   System.out.println(c4);
   System.out.println(c5);
   
   System.out.println();
   
   System.out.println("c1 == c2 is " + c1.equals(c2));
   System.out.println("c1 == c3 is " + c1.equals(c3));
   System.out.println("c1 == c4 is " + c1.equals(c4));
   System.out.println("c4 == c5 is " + c4.equals(c5));
   
   System.out.println();
   
   System.out.println("Correcting c4:");
   System.out.println("Before: " + c4);
   c4.setModel("Mustang");
   System.out.println("After: " + c4);
   
   
 }
  
}