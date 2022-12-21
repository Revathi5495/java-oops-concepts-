 import java.lang.*;
interface A
{
  public void show();
  public void display();
}
class B implements A
{
 public void show()
     {
       System.out.println("Hello");
     }
 public void display()
     {
       System.out.print(" Welcome");
     }
}
class Interface5b
{
 public static void main(String args[])
  {
     B p=new B();
     p.show();
     p.display();
  }
}
