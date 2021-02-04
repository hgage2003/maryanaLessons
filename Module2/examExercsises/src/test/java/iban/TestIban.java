package iban;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIban
{
    @Test
    public void testValid()
    {
	try
	{
	    assertTrue(Iban.ibanCheck("DE2130120400000BYI1522"));
	} catch (IncorrectIBANException e)
	{
	    fail();
	}
    }
    
    @Test
    public void testWrongCountrycode()
    {
	assertThrows(IncorrectIBANException.class, ()->Iban.ibanCheck("De2130120400000BYI1522"));
    }
    
    @Test
    public void testWrongLength()
    {
	assertThrows(IncorrectIBANException.class, ()->Iban.ibanCheck("DE2130120400000BYI152"));
    }
}
