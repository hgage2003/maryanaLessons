package de.fhws.exSheet12;

public class Address
{
    private String street;
    private String houseNumber;
    private int postCode;
    private String city;
    
    public Address(String street, String houseNumber, int postCode, String city)
    {
	if (!Character.isUpperCase(street.charAt(0)))
	    throw new RuntimeException("street must start with uppercase letter");

	if (!Character.isUpperCase(city.charAt(0)))
	    throw new RuntimeException("city must start with uppercase letter");

	if (!Character.isDigit(houseNumber.charAt(0)))
	    throw new RuntimeException("houseNumber must start with a digit");

	this.street = street;
	this.houseNumber = houseNumber;
	this.postCode = postCode;
	this.city = city;
    }
}
