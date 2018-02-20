public class PetRunner
{
  public static void main(String[] args)
  {
    Pet fido = new Dog("Fido",1);
    Pet fifi = new Cat("Fifi",3);
    Pet bud = new Pitbull("Bud",2,"American");
    
    fido.speak();
    fifi.speak();
    bud.speak();
  }
}