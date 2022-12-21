import java.lang.*;
import java.util.Scanner;
class Dupeledel
{
public static void main(String b[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
int n=sc.nextInt();
int a[]=new int[10];
int i,j,k;
System.out.println("enter array elements:");
for(i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }
int count=0;
   for(i=0;i<n;i++)
    {
      for(j=0;j<i;j++)
       {
          if(a[i]==a[j])
            {
              count++;
             }
           for(k=j;k<count;k++)
            {
             a[k]=a[k+1];
             }
            k--;j--;
        }
     }
for(i=0;i<n;i++)
    {
     System.out.print(" ",a[i]);
    }
}
}