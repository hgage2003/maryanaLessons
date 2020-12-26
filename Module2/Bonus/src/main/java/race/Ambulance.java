package race;

public class Ambulance extends Car
{
    private boolean light;
    
    public Ambulance()
    {
	super();
	light = false;
    }

    public boolean isLight()
    {
        return light;
    }

    public void setLight(boolean light)
    {
        this.light = light;
    }

}
