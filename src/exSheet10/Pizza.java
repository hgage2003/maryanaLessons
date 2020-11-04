package exSheet10;

public class Pizza 
{
	private String name;
	private int[] diameters;
	private float[] prices;
	
	public Pizza(String n, int[] d, float[] p)
	{
		name = n;	
		diameters = d;
		prices = p;
	}

	public String getName()
	{
		return name;
	}
	
	public int getDiameter(int index)
	{
		if ((index >= 0) && (index < diameters.length))
			return diameters[index];
		else return -1;
	}
	
	public float getPrice(int index)
	{
		if ((index >= 0) && (index < prices.length))
			return prices[index];
		else
			return -1;
	}
	
	public String toString()
	{
		String res;
		
		res =  "Pizza " + name + ' ';
		
		for (int i = 0; i < diameters.length; i++)
		{
			res += diameters[i] + "cm/" + prices[i] + "EUR ";
		}
		
		return res;
	}
}
