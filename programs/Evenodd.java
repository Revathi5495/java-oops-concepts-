import java.lang.*;
import java.util.Scanner;
class Evenodd
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array length:");
int n=sc.nextInt();
System.out.println("enter the array elements:");
int a[]=new int[10];
int i;
for(i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
System.out.println("your entered elements:");
for(i=0;i<n;i++)
{
 System.out.print(" "+a[i]);
}
System.out.println("\neven numbers in given array:");
for(i=0;i<n;i++)
{
if(a[i]%2==0)
{
  System.out.print(" "+a[i]);
}
}
System.out.print("\nodd numbers in given array:\n");
for(i=0;i<n;i++)
{
if(a[i]%2!=0)
{
  System.out.print(" "+a[i]);
}
}
}
}