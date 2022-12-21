import java.io.*;
public class BFile6a
{
public static void main(String args[]) throws Exception
{
FileWriter fw=new FileWriter("Add.java");
PrintWriter pw=new PrintWriter(fw);
pw.println("mec");
pw.flush();
System.out.print("successfully completed");
}
}