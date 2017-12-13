// Use this program to test your weight class.
// You can add any additional code you need to
// in order to full test your class.
public class WeightRunner
{
 public static void main(String[] args)
 {
  // Create a new Weight object
   Weight w1 = new Weight();
   Weight w2 = new Weight(3,6);
   Weight w3 = new Weight(5,30);
   
   System.out.print("w1.printWeight(): ");
   w1.printWeight();
   System.out.print("w2.printWeight(): ");
   w2.printWeight();
   System.out.print("w3.printWeight(): ");
   w3.printWeight();
     
   System.out.println("w1: " + w1);
   System.out.println("w2: " + w2);
   System.out.println("w3: " + w3);
   System.out.println();
   
   System.out.println("Changing w2 to 6 lbs, 11 oz");
   w2.setPounds(6);
   w2.setOunces(11);
   System.out.println("w2: " + w2);
   System.out.println();
   
   System.out.println("w3 has "+w1.getPounds()+" pounds and "+w1.getOunces()+" ounces.");
   System.out.println();
   
   Weight w4 = w2.add(w3);
   System.out.println("w2 + w3 = " + w4);
   System.out.println();
   
   System.out.println(w2 + " = " + w2.toKilos() + " kg");
     
    
 }
}