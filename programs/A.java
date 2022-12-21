import java.lang.*;
import java.util.*;
class Student{
String name,idno;
Double per;
void read()
{
 System.out.println("enter name:");
 Scanner s=new Scanner(System.in);
 name=s.nextLine();
 System.out.println("enter idno:");
 idno=s.nextLine();
 System.out.println("enter percentage:");
 per=s.nextDouble();
}
void display()
{
  System.out.println("name:"+name);
  System.out.println("id number:"+idno);
  System.out.println("percentage:"+per);
}
void r()
{
 return per;
}
};
class G
{
void grade(double p)
{
 if(per>=90.0f)
  {
    System.out.print("excellent");
   }
else if(per<=89 && per>=80)
   {
     System.out.print("good (A)");
    }
else if(per>=60 && per<=79)
    {
     System.out.print("well (B+)");
    }
else if(per>=30 && per<=59)
   {
    System.out.print("Ok! you are passed..");
   }
else 
  {
   System.out.print("Fail");
   }
}
};
class A
{
public static void main(String args[])
{
  Student s=new Student();
  s.read();
  s.display();
  G k=new G();
  k.grade(s.r());
}
}