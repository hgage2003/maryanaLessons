package exSheet6;

public class Exercise1 {
	public static void printTable(Double[] table)
	{
		System.out.println("Fahrenheit\tCelciuc");
		for (int i = 0; i < table.length; i++)
		{
			System.out.println(i + "\t" + String.format("%.2f", table[i]));
		}
	}

	public static void main(String[] args) 
	{
		Double[] temps = new Double[301];
		for (int i = 0; i < temps.length; i++)
		{
			temps[i] = (double)5 / 9 * (i - 32);
		}
		
		printTable(temps);
	}
}
