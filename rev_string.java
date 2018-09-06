import java.util.Scanner;
public class rev_string{  
  public static void main(String args[]){  
  Scanner sc= new Scanner(System.in);
  String str= new String ();
  str=sc.nextLine();
String temp =new String();
for (int i=str.length()-1;i>=0;i--)
{
temp=temp+str.charAt(i);
}
System.out.println(temp);
}  
}  
