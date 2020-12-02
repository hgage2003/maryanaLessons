package exSheet9;
//Lottery + sorting
import java.util.Random;

public class Exercise1 {
	public static int[] minSort(int[] array)
	{
		int res[] = array;
		
		// устанавливаем в позицию i минимальный элемент 
		for (int i=0; i < array.length - 1; i++)
		{
			// индекс минимального в массиве
			int minIndex = i;
			
			// ищем минимальный от i справа
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[minIndex])
					minIndex = j;
			}
			
			// меняем местами с i
			int temp = res[i];
			res[i] = res[minIndex];
			res[minIndex] = temp;
		}
		
		return res;
	}
	
	public static void printArray(int[] array)
	{
		for (int i=0; i < array.length; i++)
			System.out.print(String.valueOf(array[i]) +  " ");
		System.out.println();
	}
	
	public static int[] removeArrayElement(int[] arr, int index)
	{
		int res[] = new int[arr.length - 1];
		int newIndex = 0;
		
		// копируем массив в res
		for (int i=0; i<arr.length; i++)
		{
			// пропускаем элемент index
			if (i != index)
				res[newIndex++] = arr[i];
		}
		
		return res;
	}

	public static int[] lotteryDraw(int size, int drawSize)
	{		
		// здесь все возможные числа
		int lottery[] = new int[size];
		for (int i=0; i<size; i++)
			lottery[i] = i;
		
		int res[] = new int[drawSize];
		Random r = new Random();
		
		for (int i = 0; i<drawSize; i++)
		{
			int draw = r.nextInt(lottery.length);
			res[i] = lottery[draw];
			lottery = removeArrayElement(lottery, draw);
		}
		
		return res;
	}
	
	public static void main(String[] args)
	{
		int draw[] = lotteryDraw(200, 5);
		printArray(draw);
		printArray(minSort(draw));
	}

}
