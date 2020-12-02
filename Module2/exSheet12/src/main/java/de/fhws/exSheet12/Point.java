package de.fhws.exSheet12;

public class Point
{
    int x;
    int y;
    
    public void shiftPoint(int newX, int newY)
    {
	if (newX<0 || newX>1920 || newY<0 || newY>1080)
	    throw new RuntimeException("Coordinate is out of the screen");
	
	x = newX;
	y = newY;
    }  
}
