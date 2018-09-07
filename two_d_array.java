import java.util.Scanner;
class two_d_array {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of 2D array: ");
    int size=scan.nextInt();

  int[][] arr = new int [size][size];

for (int i = 0; i < arr.length; i++) 
{
			for (int j = 0; j < arr[i].length; j++) 
      {
			arr[i][j]=scan.nextInt();
			}
}
int i,j;
for ( i = 0; i < arr.length; i++) 
{
			for ( j = 0; j <arr.length; j++) 
      System.out.print(arr[i][j] + " ");
      i++;
      System.out.println("");
      for (  j=arr.length-1; j >= 0; j--) 
      System.out.print(arr[i][j] + " ");
      System.out.println("");
}
		
}
}


