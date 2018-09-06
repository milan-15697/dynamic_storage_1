import java.util.Scanner;
public class string_occur{  
  public static void main(String args[]){  
  Scanner sc= new Scanner(System.in);
  String str1= new String ();
  str1=sc.nextLine();
  String str2 =new String();
  str2=sc.nextLine();
int res=str1.indexOf(str2);

if (res!=-1)
System.out.println("Substring occured at "+res);
else
System.out.println("No occurance");

}  
}  
