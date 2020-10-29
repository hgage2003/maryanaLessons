package exSheet9;

public class Exercise3 {

	public static void main(String[] args) 
	{
		int argsCount = args.length;
		if (argsCount != 2)
		{
			System.out.println("Program requires 2 arguments, got " + String.valueOf(argsCount));
			return;
		}
		
		int result = Integer.valueOf(args[0]) * Integer.valueOf(args[1]);
		System.out.println(String.valueOf(result));
	}

}
