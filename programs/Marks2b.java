import java.lang.*;
import java.util.*;
class Marks2b{
  public static void main(String arg[])
  {
    int i;
    float m[]=new float[6];
    float per,sum=0.0f;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your 6 subject marks....(for 100 marks per each subject)");
    for(i=0;i<6;i++)
    {
    m[i]=sc.nextFloat();
    sum=sum+m[i];
    }
    System.out.println("the total 6 subjects marks are "+sum);
    System.out.println("the total percentage of all subjects are "+((sum/600)*100));
   }
};

