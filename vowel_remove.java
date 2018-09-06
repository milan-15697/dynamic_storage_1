import java.util.Scanner;
public class vowel_remove{  
  public static void main(String args[]){  
  Scanner sc= new Scanner(System.in);
  String str= new String ();
  str=sc.nextLine();
String temp =new String();

 temp = str.replaceAll("([a||e||i||o||u||A||E||I||O||U])", "");

System.out.println(temp);
}  
}  
