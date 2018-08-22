class sortarray {
public static void main(String[] args) {
int temp;
int arr[]={1,1,1,1,0,0,1,0};

for (int i=0;i<7;i++)
{
for (int j=i+1;j<7;j++)
{
if (arr[i]>arr[j])
{
  temp=arr[i];arr[i]=arr[j];arr[j]=temp;
}

}

}
for (int i=0;i<7;i++)
System.out.println (arr[i]);

}
}
