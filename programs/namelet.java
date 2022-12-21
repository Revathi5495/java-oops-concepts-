import java.lang.*;
import java.util.Scanner;
class namelet
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
System.out.println("enter the rows and coulmns:");
int r,c,i,j;
r=sc.nextInt();
c=sc.nextInt();
for(i=1;i<=r;i++)
{
  System.out.println("*");
  for(j=1;j<=c;j++)
    {
     if((i==1||i==r/2)&&j<(c-1))
       {
         System.out.print("*");
       }
     else if(j==(c-1)&&!(i==0||i==r/2))
       {
         System.out.println("*");
       }
     else
       {
         System.out.println(" ");
       }
     }
   }
}
}