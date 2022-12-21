import java.io.*;
class baisbaos6b
{
public static void main(String args[])
{
try
{
byte[] array={1,2,3,4,5,6,7,8,9};

FileOutputStream fos1=new FileOutputStream("f1.txt");
FileOutputStream fos2=new FileOutputStream("f2.txt");
FileOutputStream fos3=new FileOutputStream("f3.txt");
ByteArrayOutputStream baos=new ByteArrayOutputStream();
baos.write(101);
baos.writeTo(fos1);
baos.writeTo(fos2);
baos.writeTo(fos3);
baos.flush();

System.out.println("success");
baos.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
}
