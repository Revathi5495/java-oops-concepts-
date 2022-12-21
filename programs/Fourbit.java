import java.lang.*;
import java.util.Scanner;
class Fourbit
{
public static void main(String k[])
{
System.out.println("enter two decimal numbers:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int a[]=new int[10];
int b[]=new int[10];
int i;
if((n<=15)&&(m<=15))
{
for(i=4;i>0;i--)
{
 a[i]=n%2;
 n=n/2;
}
for(i=4;i>0;i--)
{
 b[i]=m%2;
 m=m/2;
}
for(i=0;i<4;)
{
  if(a[i]==b[i])
      {
       i++;
     }
   else if(a[i]>b[i])
         {
          System.out.println("\n1st number is grater");
          break;
         }
   else
        {
         System.out.println("\n2nd number is grater");
         break;
        }
  }
 if(i==4)
      {
      System.out.println("\nboth are equal");
      }
}
else 
{
 System.out.println("the given number is not in the 4 bits");
} 
}
}