package exercise3_hangman;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TcpClient extends TcpConnection
{
    private int port;
    private String address;
    
    public TcpClient(String address, int port)
    {
	this.address = address;
	this.port = port;
    }
    
    public void Connect() throws IOException
    {
	if (connected)
	    close();
	
	dataSocket = new Socket(address, port);
	reader = new BufferedReader(new InputStreamReader(dataSocket.getInputStream()));
	writer = new BufferedWriter(new OutputStreamWriter(dataSocket.getOutputStream()));
    
	System.out.println("Connected");
	connected = true;
    }
    
    public static void main(String[] args)
    {
	try (TcpClient client = new TcpClient("localhost", 5000);
	     Scanner scanner = new Scanner(System.in);)
	{
	    client.Connect();
	    
	    while (true)
	    {
		String str;
		
		if (client.waitForData())
		{
		    while ((str = client.readLine()) != null)
    		    	System.out.println(str);
		}
		
		str = scanner.next();
		client.write(str + '\n');
	    }
	}
	catch (IOException e)
	{
	    e.printStackTrace();
	}
    }
}
