      import java.lang.*;
      import java.util.Scanner;
      import java.lang.Math; 
      class F
      {
       int fact(int n)
       {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
         f=f*i;
         }
        return f;
       }
      }
      class Expan
       {
         public static void main(String args[])
        {
         Scanner sc=new Scanner(System.in);
         int a[]=new int[20];
         System.out.println("enter n and x values for expansions:");
         int n=sc.nextInt();
         int x=sc.nextInt();
         int i,j,d,c;
         d=0;c=0;
         double s1,s2,s3,s4,s;
         s1=0;s2=0;s4=0;s3=0;
         F k=new F();
         for(i=1;i<=n;i++)
         {
          if(i%2!=0)
          {
          if(c%2==0)
          {
            s1=s1+(Math.pow(x,i)/k.fact(i));
            c++;
            }
          else
          {
            s2=s2-(Math.pow(x,i)/k.fact(i));
            c++;
            }
         }
          else
          {
          if(d%2!=0)
          {
            s3=s3+(Math.pow(x,i)/k.fact(i));
            d++;
            }
          else
          {
            s4=s4-(Math.pow(x,i)/k.fact(i));
            d++;
            }
         }
        }
        s=0;
        for(i=1;i<=n;i++)
         {
          s=s+(Math.pow(x,i)/k.fact(i));
         } 
          System.out.println("the total sum of sinx expansion:"+(s1+s2));
          System.out.println("the total sum of cosx expansion:"+(1+s3+s4));
          System.out.println(" the total sum of e^x expansion:"+(1+s));
          System.out.println("    loge(x) (value for given x):"+(Math.log(x)));
       }  
      }