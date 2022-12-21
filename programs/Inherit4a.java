import java.lang.*;
import java.util.Scanner;
 
class Car extends Benz{
      void req()
      {
      System.out.println("enter price of benz car:");
      Scanner sc=new Scanner(System.in);
      price=sc.nextInt();
      System.out.println("what do you want milaze of benz car:");
      milaze=sc.nextInt();
      }
       void display()
      {
        System.out.println("you entered details are..");
        System.out.println(" \nprice of benz car:"+price);
        System.out.println("milaze of benz car:"+milaze);
        System.out.println("\n\nas your requirements your car is ready...");
     }
      }
class Benz{
      int price,milaze;
}
class Inherit4a{
public static void main(String args[])
{
 Car a=new Car();
 a.req();a.display(); 
   }
};