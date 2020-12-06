package de.fhws.exSheet12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FractionTest
{
    @Test
    public void testZeroDenominator()
    {
	try
	{
	    new Fraction(1,0);
	    fail();
	}
	catch (ArithmeticException e)
	{
	    assertTrue(e.getMessage() == "Zero denominator");
	}
    }
}
