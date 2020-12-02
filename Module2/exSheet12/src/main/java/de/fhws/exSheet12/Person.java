package de.fhws.exSheet12;

public class Person
{
    private String firstname;
    private String lastname;
    private Address address;
    
    public Person(String firstname, String lastname, Address address)
    {
	if (!Character.isUpperCase(firstname.charAt(0)))
	    throw new RuntimeException("firstname must start with uppercase letter");
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
    }
}
