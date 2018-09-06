import java.util.Scanner;
public class word_count{  
  public static void main(String args[]){  
  Scanner sc= new Scanner(System.in);
  String str1= new String ();
  str1=sc.nextLine();

int count=0;
for (int i=0;i<str1.length();i++)
{
if (str1.charAt(i) == ' ')
count++;
}
System.out.println("No. of Words: "+(count+1));

}  
}  
