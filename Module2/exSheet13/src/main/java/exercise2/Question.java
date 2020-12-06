package exercise2;

public abstract class Question
{
    String question;
    String answer;
    
    public String getQuestion()
    {
        return question;
    }
    public void setQuestion(String question)
    {
        this.question = question;
    }
    public String getAnswer()
    {
        return answer;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    
    abstract public boolean checkAnswer(String answer);
}
