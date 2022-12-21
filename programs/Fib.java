import java.lang.*;
import java.util.Scanner;
class P
{
 int i,j,c;
 int tem[]=new int[20];
 void prime(int a[],int n)
  {
   for(i=0;i<n;i++)
   {
     c=0;
     for(j=2;j<=a[i]/2;j++)
     {
     if(a[i]%j==0)
      {
      c++;
      break;
     }
    }
     if(c==0&&a[i]!=1)
     {
      System.out.print(" "+a[i]);
     }
  }
}
 void armstrong(int a[],int n)
  {
   int r,s;
   for(i=0;i<n;i++)
   {
    s=0;
    tem[i]=a[i];
    while(a[i]>0)
    {
     r=a[i]%10;
     s=s+r*r*r;
     a[i]=a[i]/10;
    }
    if(s==tem[i])
     {
      System.out.print(" "+tem[i]);
     }
  }
  for(i=0;i<n;i++)
   {
    a[i]=tem[i];
}
}
 void palindrome(int a[],int n)
  {
   int r,re;
   for(i=0;i<n;i++)
   {
    re=0;
    tem[i]=a[i];
    while(a[i]>0)
    {
     r=a[i]%10;
     re=re*10+r;
     a[i]=a[i]/10;
    }
    if(tem[i]==re)
     {
      System.out.print(" "+tem[i]);
     }
  }
   for(i=0;i<n;i++)
   {
    a[i]=tem[i];
}
}
  void strong(int a[],int n)
  {
   int r,f,s;
   for(i=0;i<n;i++)
   {
    f=1;
    s=0;
    tem[i]=a[i];
    while(a[i]!=0)
    {
     r=a[i]%10;
     for(i=1;i<=r;i++)
     {
       f=f*i;
     }
      a[i]=a[i]/10;
      s=s+f;
    }
    if(tem[i]==s)
     {
      System.out.print(" "+tem[i]);
     }
  }
   for(i=0;i<n;i++)
   {
    a[i]=tem[i];
}
}
}
class Fib
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter length of the fibnacii series:");
int n=sc.nextInt();
System.out.println("give input to the fibnacii series:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3,i;
int a[]=new int[10];
a[0]=n1;a[1]=n2;
for(i=2;i<n;i++)
{
n3=n1+n2;
a[i]=n3;
n1=n2;
n2=n3;
}
System.out.print("the obtained list from fibonacii series:");
for(i=0;i<n;i++)
{
 System.out.print(" "+a[i]);
}
System.out.println("\n prime numbers in fibonaci series:");
P p=new P();
p.prime(a,n);
System.out.println("\n armstrong numbers in fibonaci series:");
p.armstrong(a,n);
System.out.println("\n palindrome numbers in fibonaci series:");
p.palindrome(a,n);
System.out.println("\n strong numbers in fibonaci series:");
p.strong(a,n);
}
}

