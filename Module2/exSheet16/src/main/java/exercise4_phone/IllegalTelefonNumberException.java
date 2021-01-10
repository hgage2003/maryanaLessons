package exercise4_phone;

@SuppressWarnings("serial")
public class IllegalTelefonNumberException extends RuntimeException
{
    public IllegalTelefonNumberException(String reason)
    {
	super(reason);
    }
}
