package race;

abstract public class Vehicle
{
    protected double coordinate;
    protected double speed;
    protected double maxSpeed;
    protected int wheelsNumber;
    
    public Vehicle(double maxSpeed, int wheelsNumber)
    {
	coordinate = 0.;
	speed = 0.;
	this.maxSpeed = maxSpeed;
	this.wheelsNumber = wheelsNumber;
    }
    
    public double getCoordinate()
    {
        return coordinate;
    }

    public void setCoordinate(double coordinate)
    {
        this.coordinate = coordinate;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
	if (speed < maxSpeed)
	    this.speed = speed;
	else
	    this.speed = maxSpeed;
    }

    public double getMaxSpeed()
    {
        return maxSpeed;
    }

    protected void setMaxSpeed(double maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getWheelsNumber()
    {
        return wheelsNumber;
    }

    protected void setWheelsNumber(int wheelsNumber)
    {
        this.wheelsNumber = wheelsNumber;
    }

    public void move(int minutes)
    {
	coordinate += minutes * speed / 60.;
    }
}
