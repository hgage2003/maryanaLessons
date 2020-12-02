package de.fhws.exSheet12;
import java.lang.ArithmeticException;

public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator, int denominator)
    {
	if (0 == denominator)
	    throw new ArithmeticException("Zero denominator");
	
	this.numerator = numerator;
	this.denominator = denominator;
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }
}
