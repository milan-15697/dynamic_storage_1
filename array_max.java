import java.util.Scanner;
class array_max {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of Array: ");
    int N=scan.nextInt();
    int array[]= new int[N];
    for (int i=0;i<array.length;i++)
    array[i]=scan.nextInt();
    maxvalue(array);

  }
  public static void maxvalue(int array[])
  { int temp;
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
System.out.println("Max Value: "+array[array.length-1]);
}
}
