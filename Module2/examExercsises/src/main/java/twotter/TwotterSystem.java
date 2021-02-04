package twotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem
{
    private Map<User, List<Message>> messages = new HashMap<>();
    
    public void addMessage(User user, Message message)
    {
	message.setAuthor(user);
	
	if (messages.containsKey(user))
	    messages.get(user).add(message);
	else
	{
	    List<Message> m = new ArrayList<>();
	    m.add(message);
	    messages.put(user, m);
	}
    }
    
    List<Message> getAllMessages()
    {
	List<Message> res = new ArrayList<>();
	for (List<Message> l: messages.values())
	{
	    res.addAll(l);
	}
	
	return res;
    }
    
    List<Message> getAllMessagesFromDate(String date)
    {
	return null;
    }
    
    List<Message> getAllMessagesFromUser(User u)
    {
	if (messages.containsKey(u))
	    return messages.get(u);
	else
	    return null;
    }
}
