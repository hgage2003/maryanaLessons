package twotter;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User>
{
    private String file;

    public UserManager(String file)
    {
	this.file = file;
    }

    @Override
    public void serialize(List<User> object)
    {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
	{
	    for (User u: object)
	    {
		oos.writeObject(u);
	    }
	} catch (FileNotFoundException e)
	{
	    e.printStackTrace();
	} catch (IOException e)
	{
	    e.printStackTrace();
	}
    }

    @Override
    public List<User> deserialize()
    {
	List<User> list = new ArrayList<>();
	
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
	{
	    while (true)
	    {
		User u = (User)ois.readObject();
		list.add(u);
	    }
	} catch (FileNotFoundException e)
	{
	    e.printStackTrace();
	} catch (IOException e)
	{
	    if (!(e instanceof EOFException))
		e.printStackTrace();
	} catch (ClassNotFoundException e)
	{
	    e.printStackTrace();
	}
	
	return list;
    }
    
    public static void main(String[] args)
    {
	List<User> list = new ArrayList<>();
	
	list.add(new User("Andrey", "A12345"));
	list.add(new User("Roma", "R12345"));
	list.add(new User("Ivan", "I12345"));
	list.add(new User("Peter", "P12345"));
	list.add(new User("Olga", "O12345"));
	
	System.out.println(list);
    
	UserManager manager = new UserManager("users.dat");
	manager.serialize(list);
	
	List<User> newList = manager.deserialize();
	System.out.println(newList);
    }
}