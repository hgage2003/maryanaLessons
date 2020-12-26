package schach;


public class Board
{
    private boolean[][] field;
    
    public Board()
    {
	this.field = new boolean[8][8];
	
	for (int i=0; i<8; i++)
	    for(int j=0; j<8; j++)
		this.field[i][j] = false;
    }
    
    public void setField(int x, int y, boolean allowed)
    {
	if (x < 1 || x > 8 || y < 1 || y > 8)
	{
	    System.out.println("wrong parameter");
	    return;
	}
	
	this.field[x-1][y-1] = allowed;
    }
    
    public boolean getField(int x, int y)
    {
	if (x < 1 || x > 8 || y < 1 || y > 8)
	{
	    System.out.println("wrong parameter");
	    return false;
	}
	
	return this.field[x-1][y-1];
    }
    
    @Override
    public String toString()
    {
	String str = "";
	
	// по вертикали в обратном порядке,
	// чтобы сверху рисовалась 7я строка
	for (int j=7; j>=0; j--)
	{
	    // внутри каждой строки слева направо
	    for (int i=0; i<8; i++)
		if (field[i][j])
		    str += 'X';
		else
		    str += 'O';
	    
	    // перевод строки
	    str += '\n';
		
	}
	return str;
    }

    public Board combine(Board other)
    {
	Board result = new Board();
	
	for (int i = 1; i <= 8; i++)
	    for (int j = 1; j <= 8; j++)
		if (this.getField(i, j) ||  other.getField(i, j))
		    result.setField(i, j, true);
	
	return result;
    }

    public static void main(String[] args)
    {
	Board b = new Board();
	System.out.println(b);
    }
}
