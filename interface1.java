import java.io.*;
interface Animals
{
    void speak();
    void eat();
}
class Dog implements Animals
{
   public void speak()
   {
        System.out.println("DOG BARK");
   }
  public void eat()
  {
        System.out.println("DOG EAT");
  }
}
 
class interface1 implements Animals
{
    
    public void speak()
    {
        System.out.println("CAT MEOW");
    }
     public void eat()
  {
        System.out.println("CAT EAT");
  }
    public static void main (String[] args)
    {
        interface1 obj = new interface1();
        obj.speak();
        obj.eat();
    }
}
