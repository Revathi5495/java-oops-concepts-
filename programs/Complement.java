import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
class Complement
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
double a[]= new double[10];
double b[]= new double[10];
double d[]=new double[10];
int i,t;
int c=0;
double comp,j,rem;
System.out.println("enter the number:");
int num=sc.nextInt();
System.out.println("enter the number base:");
int r=sc.nextInt();
System.out.println("enter the complement:");
int n=sc.nextInt();
  t=num;
  while(num>0)
     {
      rem=num%10;
      c++;
      num=num/10;
     }
      if(r==2)
      {
       for(i=0;i<8;i++)
        {
         a[i]=num%2;
         num=num/2;
        }
     if(n==1)
       {
       for(i=0;i<8;i++)
       {
        if(a[i]==0)
       {
        a[i]=1;
       }
       else
        {
         a[i]=0;
        }
      }
    }
   for(i=7;i>=0;i--)
   {
   System.out.print(" "+a[i]);
   }
   System.out.print("is complement of given number");
  }
   else if(r==10&&(n==10||n==9))
    {
     comp=(Math.pow(r,c))-t;
     if(n==9)
     {
     System.out.print("complement:"+(comp-1));
     }
     else
     {
     System.out.print("complement:"+comp);
     }
   }
    else
    { 
     if(n==7)
    {
     j=(Math.pow(r,c)-1);
     i=c;
     while(j>0&&i>=0)
     {
      rem=j%8;
      a[i]=rem;
      i--;
      j=j/8;
     }
     while(num>0)
     {
      rem=num%8;
      b[i]=rem;
      i--;
      num=num/8;
     }
    for(i=c;i>=0;i--)
    {
     if(a[i]>b[i])
     {
      d[i]=a[i]-b[i];
     }
     else
     {
      if(a[i-1]==0)
      {
       i--;
       if(a[i-1]>b[i-1])
         d[i]=a[i]-b[i];
       else 
         i--;
      }
    }
   }
     for(i=0;i<=c;i++)
    {
      System.out.print(d[i]);
    }
   }
    else
    for(i=0;i<=c;i++)
    {
      d[c]=d[c]+1;
      System.out.print(d[i]);
    }
 }
}
}