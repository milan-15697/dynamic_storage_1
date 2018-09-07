import java.util.Scanner;
class bubble_case_change {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the string you want to sort: ");
    String N= new String();
    N=scan.nextLine();
  char [] array=N.toCharArray();
    bubble(array);

  }

  public static void bubble(char array[])
  { char temp;
for (int i=0;i<array.length;i++)
{
  for (int j=i+1;j<array.length;j++)
  {
  if (array[i]>array[j])
  {
temp=array[i];
array[i]=array[j];
array[j]=temp;
  }
  }
}
System.out.print("Bubble Sorted String: ");
for (int i=0;i<array.length;i++)
{
System.out.print(array[i]);
}
System.out.println("\n"+"Cases changed: ");

for (int i=0;i<array.length;i++)
{
  Character c=array[i];
  if (Character.isLowerCase(c))
  System.out.print(Character.toUpperCase(c)+"");
  else
  System.out.print(Character.toLowerCase(c)+"");
}
}
}

