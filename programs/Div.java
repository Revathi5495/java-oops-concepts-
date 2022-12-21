import java.lang.*;
import java.util.Scanner;
class Div
{
public static void main(String args[])
{
int a[]=new int[20];
int l,h,i,d,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the lower and upperbound values in integers:");
l=sc.nextInt();
h=sc.nextInt();
System.out.println("the integer values given in the range:\n");
for(i=l+1;i<h;i++)
{
 a[i]=i;
 System.out.print(" "+a[i]);
}
System.out.println("\nenter a number which is divisible for the range of numbers:");
d=sc.nextInt();
for(i=l+1;i<h;i++)
{
   c=0;
   if(i%d==0)
   {
   c++;
   }
  if(c!=0)
    System.out.print(" "+a[i]);
}
}
}