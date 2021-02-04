package twotter;

import java.util.List;

public class Twotter
{
    public static void main(String[] args)
    {
	TwotterSystem sys = new TwotterSystem();
	User u = new User("Andrey", null);
	sys.addMessage(u, new Message("Hello World"));
	List <Message> a = sys.getAllMessages();
	System.out.println(a);
	List<Message> m = sys.getAllMessagesFromDate("2018-01-31");
	System.out.println(m);
	List<Message> d = sys.getAllMessagesFromUser(u);
	System.out.println(d);
    }
}
