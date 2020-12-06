package exercise2;

public class MultipleChoices extends Question
{
    String[] multipleChoices;
    
    public String[] getMultipleChoices()
    {
        return multipleChoices;
    }

    public void setMultipleChoices(String[] multipleChoices)
    {
        this.multipleChoices = multipleChoices;
    }

    @Override
    public boolean checkAnswer(String answer)
    {
	if (answer.length() != 1)
	{
	    System.out.println("Answer must be one letter");
	    return false;
	}
	if (!Character.isLetter(answer.charAt(0)))
	{
	    System.out.println("Answer must be a letter [A-Z]");
	    return false;
	}
	
	if (answer.toLowerCase().equals(this.answer.toLowerCase()))
	    return true;
	
	return false;
    }

}
