import java.util.*;
class Display
{
	synchronized public void show()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(30);
			}
			catch(Exception e)
			{
			System.out.println(e+ " : Exception Ocuured ");	
			}
			
		}
		//System.out.println();
	}
}
class MyThread extends Thread
{
  
  Display d;
  public MyThread(Display d)
  {
	  this.d=d;
  }
   public void run()
   {
	   System.out.println(this.getName()+": Runs ");
	   d.show();
	   System.out.println(this.getName()+": Exit ");
	   
   }
}
class synchronizedthread
{
	public static void main(String ars[])
	{
		Display d=new Display();
		MyThread m=new MyThread(d);
		m.setName("T1");
		
		MyThread m1=new MyThread(d);
		m1.setName("T2");
		
		
		m.start();
		
		m1.start();
		
		
	}
}
