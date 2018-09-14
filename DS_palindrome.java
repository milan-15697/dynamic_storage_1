import java.util.*;
class DS_palindrome
{
	public static void main(String arsg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String input=s.next();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		
		if(reverse.equals(input))
		{
			System.out.println(input+" is Palindrome");
		}
		else
		{
			System.out.println(input+" not a Palindrome");
		}
	}
}
