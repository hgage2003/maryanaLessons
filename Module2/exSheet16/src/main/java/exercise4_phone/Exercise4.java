package exercise4_phone;

import java.io.*;

public class Exercise4
{

    public static void main(String[] args)
    {
	try (BufferedReader reader = new BufferedReader(new FileReader("Zeichenkontakte.txt"));
	     BufferedWriter writer = new BufferedWriter(new FileWriter("Nummernkontakte.txt"));)
	{
	    
	} catch (FileNotFoundException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
