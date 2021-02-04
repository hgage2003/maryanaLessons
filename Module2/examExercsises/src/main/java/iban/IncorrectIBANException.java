package iban;

public class IncorrectIBANException extends Exception
{

    /**
     * 
     */
    private static final long serialVersionUID = 5421203736289032528L;

    public IncorrectIBANException()
    {
	super("ERROR: File contains invalid IBAN");
    }

    public IncorrectIBANException(String message)
    {
	super(message);
    }
}
