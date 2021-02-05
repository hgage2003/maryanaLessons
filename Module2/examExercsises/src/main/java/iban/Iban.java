package iban;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Iban
{
    public static boolean ibanCheck(String iban) throws IncorrectIBANException
    {
	boolean isValid = true;
	
	String countryCode = iban.substring(0,2);
	for (char c: countryCode.toCharArray())
	    if (!Character.isUpperCase(c))
		isValid = false;
	
	if (iban.length() != 22)
	    isValid = false;
	
	if (!isValid)
	    throw new IncorrectIBANException("Iban: " + iban + " is incorrect");
	
	return isValid;
    }
    
    public static void readIbansFromFile(String filename) throws IncorrectIBANException
    {
	try (BufferedReader r = new BufferedReader(new FileReader(filename)))
	{
	    while (true)
	    {
		String iban = r.readLine();
		ibanCheck(iban);
	    }
	} catch (FileNotFoundException e)
	{
	    System.out.println("File " + filename + " not found");
	} catch (IOException e)
	{
	    if (e instanceof EOFException)
		System.out.println("Check success");
	    else
		System.out.println("Error reading file " + filename);
	}
    }
    
    public static void filesTest(String[] files)
    {
	for (String f: files)
	    try
	    {
		readIbansFromFile(f);
	    } catch (IncorrectIBANException e)
	    {
		System.out.println("File " + f + " contains wring iban");
	    }
    }
}
