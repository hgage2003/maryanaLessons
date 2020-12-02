package exSheet10;

public class Car 
{
	private String brand;
	private int engineSize;
	private String color;
	private int price;
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getEngineSize()
	{
		return engineSize;
	}
	
	public void setEngineSize(int size)
	{
		if (size > 0)
			engineSize = size;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public Car(String br, int enSize, String col, int p)
	{
		brand = br;
		if (enSize > 0)
			engineSize = enSize;
		else
			engineSize = 1600;
		
		color = col;
		price = p;
	}
	
	public String toString()
	{
		return  "Brand: " + brand + ", Color: " + color +
				", Engine size: " + engineSize + ", Price: " + price; 
	}
}