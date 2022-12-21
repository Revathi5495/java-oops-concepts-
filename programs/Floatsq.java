import java.lang.*;
class square  //business class
{
 static void sq(float x)
{
  float s=0;
  s=x*x;
  System.out.println("square of the given float is:"+s);
}
}
class Floatsq    //excution class
{
  public static void main(String k[])
{
  System.out.println("you entere the float value is:"+k[0]);
  float f=Float.parseFloat(k[0]);
  square.sq(f);
  }
}