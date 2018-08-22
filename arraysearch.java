import java.util.Scanner;
class arraysearch {
public static void main(String[] args) {
int num;
int arr[] ={1,4,6,7,8,9,10};

Scanner scan= new Scanner(System.in);
num=scan.nextInt();

int c=0;
for (int j=1;j<7;j++)
{
if (num==arr[j])
{
System.out.println (num +" is present");
c=1;
break;
}
}
if (c==0)
System.out.println (num +" is not present");




}
}
