package de.fhws.exSheet12;

/*
import static org.junit.Assert.*;
import org.junit.Test;
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest
{
    private Point p;
    private Throwable t;
	
    @BeforeEach
    public void init()
    {
	p = new Point();
    }
	
    @Test
    public void testNegativeX()
    {	
	try
	{
	    p.shiftPoint(-1, 0);
	    fail("No Exception");
	}
	catch(RuntimeException e)
	{
	    assertEquals("Coordinate is out of the screen", e.getMessage());
	}
    }
    
    @Test
    public void testLargeX()
    {
	try
	{
	    p.shiftPoint(1921, 0);
	    fail("No exception");
	}
	catch(RuntimeException e)
	{
	    assertEquals("Coordinate is out of the screen", e.getMessage());
	}
    }
    
    @Test
    public void testNegativeY()
    {
	try
	{
	    p.shiftPoint(0, -1);
	    fail("No exception");
	}
	catch(RuntimeException e)
	{
	    assertEquals("Coordinate is out of the screen", e.getMessage());
	}
    }
    
    @Test
    public void testLargeY()
    {
	t = assertThrows(RuntimeException.class, () -> p.shiftPoint(0, 1081));
	assertEquals("Coordinate is out of the screen", t.getMessage());
    }
    
    @Test
    public void testCorrectCoords()
    {
	assertDoesNotThrow(() -> p.shiftPoint(1920, 1080));
    }
}
