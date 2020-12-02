package de.fhws.exSheet12;

import static org.junit.Assert.*;
import org.junit.Test;

public class SphericalVolume
{
    public static double calcSphericalVolume(double radius)
    {
	if (radius<0)
	{
	    System.out.println("error in calcSphericalVolume: negative radius: " + radius);
	    return 0;
	}
	
	return 4./3 * Math.PI * radius * radius * radius;
    }
    
    @Test
    public void testRadiusZero()
    {
	assertEquals(0, calcSphericalVolume(0), 1E-5);
    }
    
    @Test
    public void testRadiusOne()
    {
	assertEquals(4.18879, calcSphericalVolume(1), 1E-5);
    }
    
    @Test
    public void testRadiusFive()
    {
	assertEquals(523.59878, calcSphericalVolume(5), 1E-5);
    }
    
    @Test
    public void testRadiusMinus()
    {
	assertEquals(0, calcSphericalVolume(-1), 1E-5);
    }
}
