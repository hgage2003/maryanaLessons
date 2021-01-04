package ex3_music_copy;

import java.io.*;
import java.util.Scanner;

public class Exercise3
{
    private static long copy(InputStream is, OutputStream os) throws IOException
    {
	long start = System.currentTimeMillis();
	
	byte[] b = new byte[1024];
	int n;
	
	do
	{
	    n = is.read(b);
	    if (n != -1)
		os.write(b);
	}
	while (n !=- 1);
	
	return System.currentTimeMillis() - start;
    }
    
    public static long unbufferedCopy(String inPath, String outPath) throws IOException
    {
	try (FileInputStream is = new FileInputStream(inPath);
	     FileOutputStream os = new FileOutputStream(outPath);)
	{
	    return copy(is, os);
	}
    }
    
    public static long bufferedCopy(String inPath, String outPath) throws IOException
    {
	try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(inPath));
	     BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(outPath));)
	{
	    return copy(is, os);
	}
    }
    
    public static void main(String[] args) throws IOException
    {
	try(Scanner s = new Scanner(System.in);)
	{
	    System.out.print("Input filename to copy: ");
	    String inFile = s.next();
	    String outFile = inFile + ".out";
	    
	    long unbuffered  = unbufferedCopy(inFile, outFile);
	    long buffered  = bufferedCopy(inFile, outFile);
	    double factor = (double)unbuffered / buffered;
	    System.out.println("Buffered copy is " + factor + " times faster");
	}
	catch (FileNotFoundException e)
	{
	    System.out.println(e.getMessage());
	}
    }
}
