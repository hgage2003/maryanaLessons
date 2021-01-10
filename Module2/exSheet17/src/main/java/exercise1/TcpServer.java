package exercise1;

import java.io.*;
import java.net.*;

public class TcpServer
{
    public static void main(String[] args)
    {
	final int PORT = 5000;
	try (ServerSocket servSocket = new ServerSocket(PORT);
		Socket socket = servSocket.accept();
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Persons.dat"));)
	{
	    while (true)
	    {
		oos.writeObject(ois.readObject());
		oos.flush();
	    }
	} catch (IOException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (ClassNotFoundException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
