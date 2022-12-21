import java.util.Scanner;
class Except7a
{
static int j[]=new int[6];
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<6 ;i++ )
{
System.out.println("enter"+(i+1)+"value:");
j[i]=sc.nextInt();
}
System.out.println("enter the subject number to get the marks:");
int r=sc.nextInt();
readSubjectMarks((r-1));
}
public static void readSubjectMarks(int r)
{
try
{
System.out.println("entered subject marks are:"+j[r]);
}
catch(ArithmeticException ae)//1
{
System.out.println("Denominator should not be zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("please enter valid subject number");
}
catch(Exception j)
{
System.out.println("Error occured while running");
}
}
}