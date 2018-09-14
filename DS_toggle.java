import java.util.*;
class DS_toggle
{
	public static void main(String arsg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String input=s.nextLine();
		String t="";
		System.out.println("Entered String is : "+input);
		for(int i=0;i<input.length();i++)
		{
	
			if(Character.isLowerCase(input.charAt(i)))
			{
				
				t=t+Character.toUpperCase(input.charAt(i));
			
			}
			
			else if(Character.isUpperCase(input.charAt(i)))
			{
				
				t=t+Character.toLowerCase(input.charAt(i));
				
			}
			else 
			{
				t=t+input.charAt(i);
			}
		}
		System.out.println("Toggled String is : "+t);
		
		
	}
}
