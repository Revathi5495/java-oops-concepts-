import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
 class Inverseexpan
       {
         public static void main(String args[])
        {
         Scanner sc=new Scanner(System.in);
         int a[]=new int[20];
         System.out.println("enter n and x values for expansions:");
         int n=sc.nextInt();
         int x=sc.nextInt();
         int i,c,d;
         c=0;d=0;
         double s1,s2,s3;
         s1=1;s2=1;s3=0;
         for(i=1;i<=n;i++)
         {
          if(i%2!=0)
         {
          s1=s1*(i/i+1);
          c++;
             }
         else
         {
         s2=(Math.pow(x,i+1)/i+1);
          d++;
         }
         if(c==d&&(c%2==0)&&(d%2==0))
         {
           s3=s3+s1*s2;
         }
}
        System.out.println("sin inverse x expansion for given value:"+(x+s3));
}
}