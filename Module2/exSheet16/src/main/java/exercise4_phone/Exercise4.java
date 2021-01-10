package exercise4_phone;

import java.io.*;

public class Exercise4
{

    public static void main(String[] args)
    {
	try (BufferedReader reader = new BufferedReader(new PhoneConverter(new FileReader("Words.txt")));
	     BufferedWriter writer = new BufferedWriter(new FileWriter("Numbers.txt"));)
	{
	    String convertedLetters;
	    while ( (convertedLetters = reader.readLine()) != null)
	    {
		writer.write(convertedLetters);
		writer.newLine();
		writer.flush();
	    }
	} catch (FileNotFoundException e)
	{
	    e.printStackTrace();
	} catch (IOException e)
	{
	    e.printStackTrace();
	}

    }
}
