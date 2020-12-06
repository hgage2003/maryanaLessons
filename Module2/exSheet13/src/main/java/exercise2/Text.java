package exercise2;

public class Text extends Question
{
    @Override
    public boolean checkAnswer(String answer)
    {
	if (this.answer.toLowerCase().equals(answer.toLowerCase()))
	    return true;
	
	return false;
    }

}
