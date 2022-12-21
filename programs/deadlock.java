import java.util.*;
class cse
{
public synchronized void cfirst(ece e)
{
System.out.println("thread starts execution of cse first()");
try{
Thread.sleep(2000);
}
catch(Exception l)
{
}
System.out.println("thread trying to call ece last()");
e.last();//ece
}
public synchronized void last()
{
System.out.println("last method of cse class");
}
}
class ece
{
public synchronized void efirst(cse c)
{
System.out.println("thread starts execution of ece first()");
try{
Thread.sleep(2000);
}
catch(Exception k)
{
}
System.out.println("thread trying to call cse last()");
c.last();//cse last() calling
}
public synchronized void last()
{
System.out.println("last method of ece class");
}
};
class deadlock extends Thread
{
//deadlock class used for to create child thread
cse c=new cse();
ece e=new ece();
public void jk()
{
this.start();//creates thread
c.cfirst(e);
}
public void run()
{
e.efirst(c);//child thread
}
public static void main(String args[])
{
deadlock d=new deadlock();//instantiated thread
d.jk();
}
};
