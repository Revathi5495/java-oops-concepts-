import java.lang.*;
class Days
{
public static void main(String k[])
{
System.out.println("entered  year:"+k[0]);
int y=Integer.parseInt(k[0]);
System.out.println("entered  month:"+k[1]);
int m=Integer.parseInt(k[1]);
if(m==2)
{
if(y%4==0||y%400==0||y%100==0)
{
  System.out.println("the total number days in "+m+"th month:"+29);
}
else
{
  System.out.println("the total number days in "+m+"th month:"+28);
}
}
else if(m%2==0)
{
  System.out.println("the total number days in "+m+"th month:"+30);
}
else if(m==8)
{
  System.out.println("the total number days in "+m+"th month:"+31);
}
else 
{
  System.out.println("the total number days in "+m+"th month:"+31);
}
}
}