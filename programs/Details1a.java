import java.util.*;
class Student
{
int age,marks;
String name,idno,branch,gender;
double percentage;
    void bi()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name:");
    name=sc.nextLine();
    System.out.println("enter your Id number:");
    idno=sc.nextLine();
    System.out.println("enter your gender:");
    gender=sc.nextLine();
    System.out.println("enter your Branch:");
    branch=sc.nextLine();
    System.out.println("enter your age:");
    age=sc.nextInt();
    System.out.println("enter your marks:");
    marks=sc.nextInt();
    System.out.println("enter your percentage:");
    percentage=sc.nextDouble();
    }
    void display()
    {
      System.out.println("*****welcome to java course*****");
      System.out.println("Name:"+name);
      System.out.println("Id number:"+idno);
      System.out.println("Gender:"+gender);
      System.out.println("Age:"+age);
      System.out.println("Branch:"+branch);
      System.out.println("Marks in programming:"+marks);
      System.out.println("Percentage of marks:"+percentage);
    }
}
   class Details1a
    {
     public static void main(String args[])
     {
       Student s=new Student();
       s.bi();
       s.display();
     }
    };
    