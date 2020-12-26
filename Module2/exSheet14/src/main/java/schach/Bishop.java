package schach;

public class Bishop extends AbstractFigure
{
    @Override
    public Board getAllowedFields()
    {
	Board b = new Board();
	
	for (int i = 1; i <= 8; i++)
	    for (int j = 1; j <= 8; j++)
		if ((i - this.x == j - this.y) || (i - this.x == -(j - this.y)))
		    b.setField(i, j, true);
	
	return b;
    }

    public static void main(String[] args)
    {
	Bishop t = new Bishop();
	t.setX(4);
	t.setY(3);
	
	System.out.println(t.getAllowedFields());
    }
}
