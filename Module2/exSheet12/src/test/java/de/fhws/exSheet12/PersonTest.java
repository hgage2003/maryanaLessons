package de.fhws.exSheet12;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest
{
    @Test
    public void testCorrect()
    {
	try
	{
	    new Person("John", "Doe", new Address("Main Street", "100 and one", 000001, "New York"));
	}
	catch (RuntimeException e)
	{
	    fail();
	}
    }
    
    @Test
    public void testName()
    {
	try
	{
	    new Person("john", "Doe", new Address("Main Street", "100 and one", 000001, "New York"));
	    fail();
	}
	catch (RuntimeException e)
	{
	    
	}
    }
    
    @Test
    public void testStreet()
    {
	try
	{
	    new Person("John", "Doe", new Address("main Street", "100 and one", 000001, "New York"));
	    fail();
	}
	catch (RuntimeException e)
	{
	    
	}
    }
    
    @Test
    public void testCity()
    {
	try
	{
	    new Person("John", "Doe", new Address("Main Street", "100 and one", 000001, "new York"));
	    fail();
	}
	catch (RuntimeException e)
	{
	    
	}
    }
    
    @Test
    public void testHouse()
    {
	try
	{
	    new Person("John", "Doe", new Address("Main Street", "one and one", 000001, "New York"));
	    fail();
	}
	catch (RuntimeException e)
	{
	    
	}
    }
}
