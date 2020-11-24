package exSheet11;

import exSheet10.Car; 

public class CarFactory  extends Car
{
	public static int cars_number = 0;
	
	public CarFactory(String br, int enSize, String col, int p)
	{
		super(br, enSize, col, p);
		cars_number++;
		System.out.println(String.valueOf(cars_number) + " cars produced");
	}
	
	public static int calculate_sales(int average_price)
	{
		return average_price * cars_number;
	}
	
}
