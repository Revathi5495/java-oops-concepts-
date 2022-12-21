import java.lang.*;
import java.util.*;
class buss
{
  static int display(int a,int b)
  {
    System.out.println(a*b);
    int t=a*b;
    return t;
  }
}
class ex
{
  public static void main(String k[])                                                           
  {
    int a;
    int b;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   buss obj=new buss();
   obj.display(a,b);
 }
}