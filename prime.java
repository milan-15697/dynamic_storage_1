import java.util.Scanner;
class prime {
public static void main(String[] args) {

int num,flag;
Scanner scan= new Scanner(System.in);
num=scan.nextInt();

for (int i=1;i<=num;i++)
{
  flag=0;
  for (int j=1;j<=i;j++)
  {
 if ((i%j)==0)
flag++;
  }
if (flag==2)
System.out.println (i);

}
  }
}
