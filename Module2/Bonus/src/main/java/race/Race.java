package race;

public class Race
{

    public static void main(String[] args)
    {
	Vehicle vehicles[] = new Vehicle[4];
	
	vehicles[0] = new Bicycle();
	vehicles[0].setSpeed(20);
    
	vehicles[1] = new Car();
	vehicles[1].setSpeed(150);
	
	vehicles[2] = new RaceCar();
	vehicles[2].setSpeed(200);
	
	vehicles[3] = new Ambulance();
	vehicles[3].setSpeed(80);
	
	if (vehicles[3] instanceof Ambulance)
	{
	    ((Ambulance)vehicles[3]).setLight(true);
	}
	
	vehicles[0].move(240);
	
	for (int i = 0; i < vehicles.length; i++)
	{
	    vehicles[i].move(60);
	    System.out.println(vehicles[i].coordinate);
	}
    }
}