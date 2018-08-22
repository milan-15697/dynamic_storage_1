import java.util.Scanner;
import java.lang.Math;

class reverse {
public static void main(String[] args) {

int num,temp,temp2,flag,digits,c=0;
Scanner scan= new Scanner(System.in);
num=scan.nextInt();

temp=temp2=num;
while(temp!=0)
{
  temp/=10;
  ++c;
}

int ld,rev=0;
for (int i=0;i<c;i++)
{
ld=temp2%10;
rev=rev*10+ld;
temp2=temp2/10;
}

System.out.println ("Reverse: "+rev);

}
}

