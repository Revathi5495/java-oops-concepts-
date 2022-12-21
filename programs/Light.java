import java.lang.*;
class Light
{
public static void main(String a[])
{
System.out.println("enter the number of days:"+a[0]);
int k;
double d;
int i=Integer.parseInt(a[0]);
k=i*24*60*60;
d=3*k*0.000621;
System.out.println("light travel distance in miles per day:"+d+"*10^8");
}
}