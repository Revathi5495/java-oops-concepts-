class InnerInstance3a
{
int a=5;
static int c=6;
class Inner
{
public void m()
{

System.out.println("Inner class called "+a+","+c);//5,6

}
};
void m2()
{
Inner i=new Inner();
i.m();
}
public static void main(String k[])//program driver
{
InnerInstance3a o2=new InnerInstance3a();
o2.m2();
// you can access using basic approach
}
}