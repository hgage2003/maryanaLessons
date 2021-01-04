package ex1_exceptions;

import java.io.*;  
import java.util.ArrayList;

public class Exceptions
{

    public static void main(String[] args)
    {
	try
	{
	    Integer.parseInt("A");
	}
	catch (Exception e)
	{
	    System.out.println(e);
	}
	
	try
	{
	    int[] arr = new int[3];
	    System.out.println(arr[3]);
	}
	catch (Exception e)
	{
	    System.out.println(e);
	}
	
	try
	{
	    int[] arr = null;
	    System.out.println(arr[2]);
	}
	catch (Exception e)
	{
	    System.out.println(e);
	}
	
	try
	{
	    ArrayList<Object> al = new ArrayList<>();
	    
	    for (;;)
		al.add(new Object[10000]);
	    
	}
	catch (Error e)
	{
	    System.out.println(e);
	}
	
	try
	{
	    File file = new File("C:\\demo\\demofile.txt"); 
	    FileInputStream fis=new FileInputStream(file);
	    fis.read();
	    fis.close();
	}
	catch (Exception e)
	{
	    System.out.println(e);
	}
	
	try
	{
	   int i = 5 / 0;
	   System.out.println(i);
	}
	catch (Exception e)
	{
	    System.out.println(e);
	}
    }
}
