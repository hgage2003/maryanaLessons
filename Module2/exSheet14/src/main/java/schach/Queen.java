package schach;

public class Queen extends AbstractFigure
{
    private Rook rook;
    private Bishop bishop;
    
    public Queen()
    {
	super();
	this.rook = new Rook();
	this.bishop = new Bishop();
    }

    @Override
    public Board getAllowedFields()
    {
	return bishop.getAllowedFields().combine(rook.getAllowedFields());
    }
    
    @Override
    public void setX(int x)
    {
	super.setX(x);
	bishop.setX(x);
	rook.setX(x);
    }

    @Override
    public void setY(int y)
    {
	super.setY(y);
	bishop.setY(y);
	rook.setY(y);
    }


    public static void main(String[] args)
    {
	Queen t = new Queen();
	t.setX(4);
	t.setY(4);
	
	System.out.println(t.getAllowedFields());
    }
}
