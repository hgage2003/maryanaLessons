package exercise4_phone;

import java.io.IOException;
import java.io.Reader;

public class PhoneConverter extends Reader
{
    private Reader reader;
    
    public PhoneConverter(Reader reader)
    {
	this.reader = reader;
    }
    
    char convert(char ch)
    {
	ch = Character.toLowerCase(ch);
	
	if (Character.isLetter(ch))
	{
	    if (ch <= 'c')
		ch = '2';
	    else if (ch <= 'f')
		ch = '3';
	    else if (ch <= 'i')
		ch = '4';
	    else if (ch <= 'l')
		ch = '5';
	    else if (ch <= 'o')
		ch = '6';
	    else if (ch <= 's')
		ch = '7';
	    else if (ch <= 'v')
		ch = '8';
	    else
		ch = '9';
	}
	else if (ch != '\n')
	    throw new IllegalTelefonNumberException("Unsupported character '" + String.valueOf(ch) + "'");
	
	return ch;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException
    {
	int character;
	int writen = 0;
	while (((character = reader.read()) != -1) && (writen <= len))
	{
	    cbuf[off + writen] = convert((char)character);
	    writen++;
	}
	
	return writen;
    }

    @Override
    public void close() throws IOException {}
}
