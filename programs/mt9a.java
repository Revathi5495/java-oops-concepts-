
class display
{
public void show(String name)
{
for(int i=0;i<5;i++)
{
// one lakh LOC
synchronized(display.class)
{
System.out.print("good afternoon:");
try{
Thread.sleep(2000);
}
catch(Exception e)
{
}
System.out.println(name);
}
}
}
};
class cse extends Thread
{
display d;
String name;
cse(display d,String name)
{
this.d=d;
this.name=name;
}
public void run()
{
d.show(name);
}
};
class mt9a
{
public static void main(String args[])throws Exception
{
display d1=new display();
display d2=new display();
cse c1=new cse(d1,"jk");//child thred instantiated
cse c2=new cse(d2,"daddy");
c1.start();//child thread created-2 threads -main, c1
c2.start();// three - main c1,c2
}
}