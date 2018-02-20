public class Pitbull extends Dog
{
  private String breed;
  
  public Pitbull(String name, int age, String breed)
  {
    super(name, age);
    this.breed = breed;
  }
  
 @Override public void speak()
 {
   System.out.println("LOUD BARK");
 }
}