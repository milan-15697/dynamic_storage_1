import java.util.*;
import java.lang.String;
class DS_caseconversion {
    public static void main(String args[] )  {
Scanner scan= new Scanner (System.in);
int tc=scan.nextInt();
while (tc>0)
{
    String val= new String();
    String main= new String();
    main=scan.next();
    val=toggle(main);

System.out.println("\nValue: ");
System.out.println(val);

 tc--;   
}

    }

    public static String toggle(String string)
    {
  char [] arr= string.toCharArray();

StringBuffer string2=new StringBuffer();

   for (int i=0;i<string.length();i++)
   {
if (Character.isLowerCase(arr[i]))
arr[i]=Character.toUpperCase(arr[i]);
else
arr[i]=Character.toLowerCase(arr[i]);
    }

    return Arrays.toString(arr);

}
}

