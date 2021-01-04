package ex2_outputstreamdemo;

import java.io.*;

public class OutputStreamDemo
{
    public void write(byte b[], int off, int len) throws IOException
    {
	try (OutputStream os = new FileOutputStream("outputstreamdemo.txt");)
	{
	    os.write(b, off, len);
	    os.flush();
	}
    }
    
    public static void main(String[] args) throws IOException
    {
	OutputStreamDemo t = new OutputStreamDemo();
	String str = "Test string";
	t.write(str.getBytes(), 0, str.length());
    }
}
