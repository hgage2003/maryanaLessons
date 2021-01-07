package exercise3_hangman;

import java.io.*;
import java.net.*;

public class TcpServer extends TcpConnection
{
    private int portNum;
    
    public TcpServer(int port)
    {
	portNum = port;
    };
    
    public void Listen() throws IOException
    {	
	if (connected)
	    close();
	
	System.out.println("Server started");
	
	try (ServerSocket servSocket = new ServerSocket(portNum);)
	{
	    dataSocket = servSocket.accept();
	    
	    reader = new BufferedReader(new InputStreamReader(dataSocket.getInputStream()));
	    writer = new BufferedWriter(new OutputStreamWriter(dataSocket.getOutputStream()));
	    
	    System.out.println("Connection accepted");
	    connected = true;
	}
    }
    
    public static void main(String[] args)
    {
	Hangman game = new Hangman();
	
	try(TcpServer server = new TcpServer(5000);)
	{
	    server.Listen();
	    
	    while (!game.end())
	    {
		server.write(game.getGuess() + "\nAttempt " + String.valueOf(game.getTries()) + ". Enter letter or word:\n");
		
		String str = server.readLine();
		game.play(str);
	    }
	    
	    server.write("Hidden word: " + game.getAnswer() + '\n');
	    
	    if (game.isWon())
		server.write("Congratulations, you won!\n");
	    else
		server.write("You lost\n");
	    
	}
	catch (IOException e)
	{
	    e.printStackTrace();
	}
    }
}
