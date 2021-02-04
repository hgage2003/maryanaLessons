package twotter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Message
{
    private User author;
    private int charCounter;
    private String message;
    private String creationDate;
    
    public Message(String message)
    {
	this.message = message;
	this.charCounter = message.length();
	
	Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
          
        this.creationDate = dateFormat.format(date);
    }
    public User getAuthor()
    {
        return author;
    }
    public void setAuthor(User author)
    {
        this.author = author;
    }
    public int getCharCounter()
    {
        return charCounter;
    }
    public void setCharCounter(int charCounter)
    {
        this.charCounter = charCounter;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public String getCreationDate()
    {
        return creationDate;
    }
    public void setCreationDate(String creationDate)
    {
        this.creationDate = creationDate;
    }
    @Override
    public String toString()
    {
	return "Message [author=" + author + ", message=" + message + ", creationDate=" + creationDate + "]";
    }
}
