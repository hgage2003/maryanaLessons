package exercise1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TcpClient
{
    public static void main(String[] args)
    {
	final String ADDR = "localhost";
	final int PORT = 5000;
	try (Socket socket = new Socket(ADDR, PORT);
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		Scanner scanner = new Scanner(System.in);)
	{
	    while (true)
	    {
		Person p = new Person();
		
		System.out.println("name:");
		p.setName(scanner.next());
		System.out.println("surname:");
		p.setSurname(scanner.next());
		System.out.println("num:");
		p.setNumber(scanner.nextInt());
		
		oos.writeObject(p);
		oos.flush();
	    }
	} catch (UnknownHostException e)
	{
	    e.printStackTrace();
	} catch (IOException e)
	{
	    e.printStackTrace();
	}
    }

}
