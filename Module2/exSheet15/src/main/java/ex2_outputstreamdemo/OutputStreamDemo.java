package ex2_outputstreamdemo;

import java.io.*;

public class OutputStreamDemo
{
    public static void write(byte b[], int off, int len) throws IOException
    {
	try (OutputStream os = new FileOutputStream("outputstreamdemo.txt");)
	{
	    os.write(b, off, len);
	}
    }
    
    public static void main(String[] args) throws IOException
    {
	String str = "Test string";
	OutputStreamDemo.write(str.getBytes(), 0, str.length());
    }
}
