import java.util.*;
public class DS_substring{  
  public static void main(String args[]){  
  Scanner sc= new Scanner(System.in);
  int tc=sc.nextInt();
  while(tc>0)
  {
  String str= new String ();
  str=sc.next();
//int c=0;
for (int i=0;i<str.length();i++)
{
for(int j=i;j<str.length();j++)
    {
System.out.println(str.substring(i,j+1));
    }
 }
//System.out.println(c);
tc--;
}
     }  
}  
