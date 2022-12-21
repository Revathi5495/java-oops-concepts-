import java.lang.*;
/*class Num  //business class
{
 void prime(int a,int b)
{
  int i,j,count=0;
  for(i=a;i<b;i++)
  {
    for(j=1;j<=i;j++)
    {
     if(i%j==0)
      {
        count=count+1;
       }
    }
    if(count==2)
     {
       System.out.println(" "+i);
     }
   }
}
}*/
class Prime    //excution class
{
  public static void main(String k[])
{
  System.out.println("lowerbound:"+k[0]);
  System.out.println("upperbound:"+k[1]);
  int a=Integer.parseInt(k[0]);
  int b=Integer.parseInt(k[1]);
  //Num n=new Num();
  System.out.println("Prime numbers with in range are:");
  int i,j,count=0;
  for(i=a;i<b;i++)
  {
    for(j=1;j<=i;j++)
    {
     if(i%j==0)
      {
        count=count+1;
       }
    }
    if(count==2)
     {
       System.out.println(" "+i);
     }
   }
}
  //n.prime(a,b);
  }
}