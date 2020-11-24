package exSheet11;

public class Exercise1 {

	public static void main(String[] args) 
	{
		CarFactory[] cars = new CarFactory[3];
		cars[0] = new CarFactory("Audi", 2000, "Red", 2000);
		cars[1] = new CarFactory("BMW", 3500, "Black", 2700);
		cars[2] = new CarFactory("Opel", 1800, "White", 1300);
		
		System.err.println(CarFactory.calculate_sales(1000));
	}

}
