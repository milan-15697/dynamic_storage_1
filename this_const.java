class this_const {
   public this_const() {
      System.out.println("Non-Param called through para");
   }

   public this_const(int p1, String p2) {
       this();
   }

public static void main(String args[])
{
this_const obj=new this_const(222, "Milan");
}
}
