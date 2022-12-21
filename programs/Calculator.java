import java.lang.*;
import java.util.Scanner;
class Calculator
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter the values of a and b:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("------Arthematic operations-----");
System.out.println("1.addition\n2.substraction\n2.Multiplication\n4.Division\n5.modulus");
int ch;
System.out.println("enter your choice:");
ch=sc.nextInt();
switch(ch)
{
    case 1:
         System.out.println("\naddition of a and b:"+(a+b));
         break;
    case 2:
         System.out.println("\nsubstraction of a and b:"+(a-b));
         break;
    case 3:
         System.out.println("\nmultiplication of a and b:"+(a*b));
         break;
    case 4:
         if(b==0)
            System.out.println("division by zero exception caught..");
         else
            System.out.println("\ndivision of a and b:"+(a/b));
         break;
    case 5:
         if(b==0)
            System.out.println("division by zero exception caught..");
         System.out.println("\nmodulus of a and b:"+(a%b));
         break;
    default:
         System.out.println("\nyou entered choice is not avialble..");
         break;
}
}
}