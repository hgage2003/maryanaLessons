package de.fhws.exSheet12;

import static org.junit.Assert.*;
import org.junit.Test;

public class PointTest
{
    @Test
    public void testNegativeX()
    {
	try
	{
	    Point p = new Point();
	    p.shiftPoint(-1, 0);
	    fail();
	}
	catch(RuntimeException e)
	{
	    if (!e.getMessage().equals("Coordinate is out of the screen"))
		fail("test failed");
	}
    }
    
    @Test
    public void testLargeX()
    {
	try
	{
	    Point p = new Point();
	    p.shiftPoint(1921, 0);
	    fail();
	}
	catch(RuntimeException e)
	{
	    if (!e.getMessage().equals("Coordinate is out of the screen"))
		fail("test failed");
	}
    }
    
    @Test
    public void testNegativeY()
    {
	try
	{
	    Point p = new Point();
	    p.shiftPoint(0, -1);
	    fail();
	}
	catch(RuntimeException e)
	{
	    if (!e.getMessage().equals("Coordinate is out of the screen"))
		fail("test failed");
	}
    }
    
    @Test
    public void testLargeY()
    {
	try
	{
	    Point p = new Point();
	    p.shiftPoint(0, 1081);
	    fail();
	}
	catch(RuntimeException e)
	{
	    if (!e.getMessage().equals("Coordinate is out of the screen"))
		fail("test failed");
	}
    }
    
    @Test
    public void testCorrectCoords()
    {
	try
	{
	    Point p = new Point();
	    p.shiftPoint(1920, 1080);

	}
	catch(RuntimeException e)
	{
	    fail();
	}
    }
}
