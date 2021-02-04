package exercise1;

import java.io.*;

public class PersonReader 
{
    public static void main(String[] args) 
    {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream ("Persons.dat"));)
	{
	    while(true)
	    {
		Person p =(Person)ois.readObject();
		System.out.println(p);
	    }
	} catch (FileNotFoundException e) 
	{
	    e.printStackTrace();
	} catch (IOException e) 
	{
	    if (!(e instanceof EOFException))
		e.printStackTrace();
	} catch (ClassNotFoundException e) 
	{
	    e.printStackTrace();
	}
	
    }
}