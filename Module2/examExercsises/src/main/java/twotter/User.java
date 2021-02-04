package twotter;
import java.io.Serializable;

public class User implements Serializable, Comparable<User>
{
    /**
     * 
     */
    private static final long serialVersionUID = -7288063510365025240L;
    
    @Override
    public String toString()
    {
	return "User [name=" + name + ", password=" + password + "]";
    }

    private String name;
    transient private String password;

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public User(String name, String password)
    {
	this.name = name;
	this.password = password;
    }

    @Override
    public int compareTo(User o)
    {
	return this.name.compareTo(o.name);
    }
}
