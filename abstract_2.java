abstract class Animals {
  String color,breed,name;
    abstract void eat();
    void speak()
    {
    System.out.println("Parent speaks"); 
    }
    }


class Child extends Animals {
    void eat() { 
      System.out.println("Child eats"); }
      void speak()
      {
      System.out.println("Child speaks"); }
      
}
class abstract_2 {
    public static void main(String args[]) { 
     
        Child obj = new Child();
        obj.eat(); 
    }
}
