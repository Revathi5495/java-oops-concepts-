import java.lang.*;
import java.util.Random;
import java.util.Scanner;
class artheve
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
Random r=new Random();
int n1=r.nextInt(100);
int n2=r.nextInt(100);
System.out.println("the random numbers are n1="+n1+" and n2="+n2);
System.out.println("*****arthematic operations*****");
System.out.println("\nI.Additon\nII.Substraction\nIII.Multiplication\nIV.Divison\nV.Summary\nVI.Exit\n");
while(true)
{
 int s=0;
 int b=0;
 System.out.println("select which operation result you want to enter:");
  int ch=sc.nextInt();
 switch(ch)
 {
    case 1:
     {
      while(true)
     {
      System.out.println("How much is addition of n1 and n2?");
      int a=sc.nextInt();
      if(a==(n1+n2))
      {
       System.out.println(" Very Good!!! ");break;
      }
      else if(b==0)
      { 
      System.out.println("No, please try again");
      }
      else if(b==1)
      { 
      System.out.println("Sorry, wrong answer, try again");
      }
      else if(b==2)
      { 
      System.out.println("Wrong, Try once more");
      }
     else
      { 
      System.out.println("Don’t lose hope, keep trying");
      }
      b++;
    }
      break;
     }
   case 2:
     {
     while(true)
     {
      System.out.println("what is the value when n1 is subtracted from n2?");
      int a=sc.nextInt();
      if(a==(n2-n1))
      {
       System.out.println("  Excellent! ");
      }
     else if(c==0)
      { 
      System.out.println("No, please try again");
      }
     else if(c==1)
      { 
      System.out.println("Sorry, wrong answer, try again");
      }
     else if(c==2)
      { 
      System.out.println("Wrong, Try once more");
      }
     else
      { 
      System.out.println("Don’t lose hope, keep trying");
      }
      c++;
     }
      break;
     }
  case 3:
     {
     while(true)
     {
      System.out.println("multiplication of n1 and n2 is?");
      int a=sc.nextInt();
      if(a==(n2*n1))
      {
       System.out.println(" Nice Work!!! ");
      }
     else if(e==0)
      { 
      System.out.println("No, please try again");
      }
     else if(e==1)
      { 
      System.out.println("Sorry, wrong answer, try again");
      }
     else if(e==2)
      { 
      System.out.println("Wrong, Try once more");
      }
     else
      { 
      System.out.println("Don’t lose hope, keep trying");
      }
      e++;
     }
      break;
     }
  case 4:
     {
      while(true)
     {
      System.out.println("the result of n1/n2 is?");
      int a=sc.nextInt();
      int f=0;
      if(a==(n1/n2))
      {
       System.out.println(" Keep It up!!! ");
       break;
      }
     else if(f==0)
      { 
      System.out.println("No, please try again");
      }
     else if(f==1)
      { 
      System.out.println("Sorry, wrong answer, try again");
      }
     else if(f==2)
      { 
      System.out.println("Wrong, Try once more");
      }
     else
      { 
      System.out.println("Don’t lose hope, keep trying");
      }
      f++;
     }
      break;
     }
  case 5:
    {
      System.out.println("your are doing well..");
    }
  case 6:
    {
       System.out.println("enter");
       break;    
    } 
  default:
         System.out.println("\nyou entered choice is not avialble..");
         break;
  }
  s++;
}
}
}