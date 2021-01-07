package exercise3_hangman;

import java.io.*;
import java.net.*;

public abstract class TcpConnection implements Closeable
{
    protected Socket dataSocket;
    protected BufferedReader reader;
    protected BufferedWriter writer;
    
    protected boolean connected = false;
    
    // returns true if IOException was thrown
    private static boolean closeResource(Closeable res)
    {
	boolean fail = false;
	if (res != null)
	{
	    try
	    {
		res.close();
	    }
	    catch (IOException e)
	    {
		e.printStackTrace();
		fail = true;
	    }
	}
	
	return fail;
    }
    
    @Override
    public void close() throws IOException
    {
	boolean fail = false;
	
	fail |= closeResource(dataSocket);
	fail |= closeResource(reader);
	fail |= closeResource(writer);
	
	connected = false;
	
	if (fail)
	    throw new IOException("close fail");
    }
    
    public String readLine() throws IOException
    {
	if (!connected)
	    return null;
	
	return reader.readLine();
    }
    
    public void write(String str) throws IOException
    {
	if (connected)
	{
	    writer.write(str);
	    writer.flush();
	}
    }
}
