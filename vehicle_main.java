abstract class vehicle
{
abstract void start();
void stop()
{
  System.out.println("Vehicle stopped");
}
}
class two_wheel extends vehicle          
{
    public void start()
    {
         System.out.println("Two wheeler started");
    }
    public void stop()
    {
         System.out.println("Two wheeler stopped");
    } 
}
class four_wheel extends vehicle
{
    public void start()
    {
         System.out.println("Four wheeler started");
    }
    public void stop()
    {
         System.out.println("Four wheeler stopped");
    } 
    
}
class vehicle_main
{
   public static void main(String args[])
   {
       four_wheel obj = new four_wheel();
       two_wheel obj2 = new two_wheel();
       obj.start();
       obj.stop();
      obj2.start();
      obj2.stop();
  

   }
   }
