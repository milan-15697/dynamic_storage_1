class Display
{
    public void disp()
    {
         System.out.println("NULL");
    }
    public void disp(int num)  
    {
         System.out.println("INT: "+num);
    } 
    public void disp(float c)
    {
         System.out.println("FLOAT: "+c);
    }  
}
class print_overload
{
   public static void main(String args[])
   {
       Display obj = new Display();
       obj.disp();
       obj.disp(2.234f);
       obj.disp(10);
   }
}
