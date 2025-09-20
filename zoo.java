interface Animal{
   public void makeSound();
   public void move();
}
class Bird implements Animal{

   public void makeSound() {
      System.out.println("Chirp");
   }

   public void move() {
      System.out.println("Fly");
   } 
}
class Dog implements Animal{

   public void makeSound() {
      System.out.println("Bark");
   }

   public void move() {
      System.out.println("Run");
   } 
}
public class zoo{
public static void main(String args[]) {
     Bird b = new Bird ();
    Dog d = new Dog ();
      b.makeSound();
      b.move();
       d.makeSound();
      d.move();
   }
}
      