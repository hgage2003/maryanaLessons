package exercise1;

import java.io.Serializable;

public class Person implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -4846446424299971164L;
    private String name;
    private String surname;
    private int number;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public int getNumber()
    {
        return number;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    @Override
    public String toString()
    {
	return "Person [name=" + name + ", surname=" + surname + ", number=" + number + "]";
    }
}
