class Animal
{
String breed, color;
void speak()
{
System.out.println("ANIMAL CLASS SPEAK");
}
}
class Dog extends Animal
{
void speak()
{ 
System.out.println("DOG CLASS SPEAK");
}
}
class over_inheritance extends Animal
{ 
void speak()
{
System.out.println("CAT CLASS SPEAK");
}

public static void main (String args [])
{
Cat obj = new Cat();
obj.speak();
}

}

