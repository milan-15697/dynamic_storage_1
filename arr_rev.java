import java.util.Scanner;
class arr_rev {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size=scan.nextInt();

int[] arr = new int [size];

for (int i=0;i<arr.length;i++)
arr[i]=scan.nextInt();

reverse(arr);
}
public static void reverse(int arr[])
{

 for (int i=arr.length-1;i>=0;i--)
 System.out.println(arr[i]);

}

}


