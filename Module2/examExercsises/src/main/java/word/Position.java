package word;

public final class Position implements Comparable<Position>
{
    int line, column;
    
    @Override
    public int compareTo(Position o)
    {
	int deltaLine = this.line - o.line;
	if (deltaLine != 0)
	    return deltaLine;
	
	return this.column - o.column;
    }

    public Position(int line, int column)
    {
	this.line = line;
	this.column = column;
    }

    @Override
    public String toString()
    {
	return "Position [line=" + line + ", column=" + column + "]";
    }
}
