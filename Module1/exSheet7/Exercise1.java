package exSheet7;

// 	расчет числа Пи

import java.util.Scanner;

public class Exercise1 {
	// площадь прямоугольника с номером num из qty
	public static double rect(int num, int qty)
	{
		// катет треугольника для нахождения высоты прямоугольника 
		double l = (double)num / qty;
		// высота прямоугольника по теореме Пифагора
		double h = Math.sqrt(1 - l * l);
		
		// ширина прямоугольника всегда 1 / qty
		return h / qty;
	}

	public static void main(String[] args) 
	{
		// количество прямоугольников в четверти круга
		System.out.print("Please enter number of rectangles:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		// складываем площади всех прямоугольников
		double area = 0;
		for (int i = 1; i <= x; i++)
			area += rect(i, x);
		
		// домножаем на 4, т.к. посчитали площадь четверти круга
		System.out.println(area * 4);
	}

}
