package exSheet5;

public class Exercise3 {
	// табличка для любого числа
	// пишет 10 строчек вида  '2 x 3 = 6'
	public static void printTable(int n)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			printTable(i);
			System.out.println("-----");
		}
	}

}
