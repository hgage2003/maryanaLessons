package exSheet10;

public class Exercise4 {

	public static int sum(int[] numbers)
	{
		int res = 0;
		
		for (int i: numbers)
			res += i;
		
		return res;
	}
	
	public static int sub(int[] numbers)
	{
		int res = numbers[0];
		
		for (int i = 1; i < numbers.length; i++)
			res -= numbers[i];
		
		return res;
	}
	
	public static void main(String[] args) 
	{
		int argsSz = args.length;
		if (argsSz < 3)
		{
			System.out.println("Need at least 3 parameters, got " + String.valueOf(argsSz));
			return;
		}
		
		int[] numbers = new int[argsSz - 1];
		for (int i = 0; i < argsSz - 1; i++)
			numbers[i] = Integer.valueOf(args[i]);
		
		char action = args[argsSz - 1].charAt(0);
		
		if (action == '+')
			System.out.println(sum(numbers));
		else if (action == '-')
			System.out.println(sub(numbers));
		else
			System.out.println("Wrong action " + String.valueOf(action));
	}
}
