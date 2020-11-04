package exSheet10;

//import exSheet10.Car;

public class Exercise12 {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0] = new Car("Audi", 2000, "Red", 2000);
		cars[1] = new Car("BMW", 3500, "Black", 2700);
		cars[2] = new Car("Opel", 1800, "White", 1300);

		int maxSize = Integer.MIN_VALUE;
		int maxSizeIntex = -1;
		for (int i = 0; i < cars.length; i++)
		{
			int currentSize = cars[i].getEngineSize();
			if (currentSize > maxSize)
			{
				maxSize = currentSize;
				maxSizeIntex = i;
			}
		}
		
		System.out.println("Car " + cars[maxSizeIntex] + " have largest engine");
	}

}
