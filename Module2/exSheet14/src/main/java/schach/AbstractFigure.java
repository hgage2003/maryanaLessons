package schach;

public abstract class AbstractFigure implements Figure
{
    protected int x;
    protected int y;
    
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
	if (x >= 1 && x <= 8)
	    this.x = x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
	if (y >= 1 && y <= 8)
	    this.y = y;
    }
}
