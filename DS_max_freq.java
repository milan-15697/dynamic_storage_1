import java.util.*;
class DS_max_freq
{
	static char fun(String input)
	{
		int a[]=new int[256];
		int max=-1;
		char freq=' ';
		 for (int i=0;i<input.length();i++) 
		 {
			 a[input.charAt(i)]++;
			 
            if (max<a[input.charAt(i)]) 
			{
                max=a[input.charAt(i)];
                freq=input.charAt(i);
            }
        }
		return freq;
	}
	public static void main(String arsg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String input=s.next();
		System.out.println("Maximum Frequency Element: "+fun(input));
		
	}
}
