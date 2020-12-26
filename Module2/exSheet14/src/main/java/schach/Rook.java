package schach;

public class Rook extends AbstractFigure
{

    @Override
    public Board getAllowedFields()
    {
	Board b = new Board();
	
	for (int i = 1; i <= 8; i++)
	    for (int j = 1; j <= 8; j++)
		if (i == this.x || j == this.y)
		    b.setField(i, j, true);
	
	return b;
    }
    
    public static void main(String[] args)
    {
	Rook t = new Rook();
	t.setX(3);
	t.setY(2);
	
	System.out.println(t.getAllowedFields());
    }

}
