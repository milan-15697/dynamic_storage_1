import java.util.*;
class DS_palindrome {
    public static void main(String args[] )  {
Scanner scan= new Scanner (System.in);
int tc=scan.nextInt();
while (tc>0)
{
    String val= new String();
    String main= new String();
    main=scan.next();
    val=palindrome(main);

System.out.println("\nValue: ");
System.out.println(val);

 tc--;   
}

    }
    public static String palindrome(String str)
    {
    //String str= new String ();
    
    char c[]=str.toCharArray();
    char c2[]=str.toCharArray();
    int flag=0;
    
int j=0;
 for (int i=str.length()-1;i>=0;i--)
 {   
   c2[j]=c[i];
   j++;
 }

 String str2= new String (c2);
int m=str.compareTo(str2);

    if (m==0)
    System.out.print("True");
    else
    System.out.print("NO");

return str2;
    }
}

