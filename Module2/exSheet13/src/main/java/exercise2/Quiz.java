package exercise2;

import java.util.Scanner;

public class Quiz
{
    public static void main(String[] args)
    {
	Question questions[] = new Question[2];
	    
	questions[0] = new Text();
	questions[0].setQuestion("What is the capital of Germany?");
	questions[0].setAnswer("Berlin");
	
	MultipleChoices q1 = new MultipleChoices();
	q1.setQuestion("How many protons does a hydrogen atom have?");
	String[] mc = {"A: 4","B: 2", "C: 1", "D: 0"};
	q1.setMultipleChoices(mc);
	q1.setAnswer("C");
	
	questions[1] = q1;
	
	Scanner scanner = new Scanner(System.in);
	for (int i=0; i<questions.length; i++)
	{
	    System.out.println((i+1) + " " + questions[i].getQuestion());
	    
	    if (questions[i].getClass() == Text.class)
	    {
		// two blank lines
		System.out.println("\n\n");
	    }
	    else if (questions[i].getClass() == MultipleChoices.class)
	    {
		String[] choices = ((MultipleChoices)questions[i]).getMultipleChoices();
		for (int j = 0; j < choices.length; j++)
		{
		    System.out.println(choices[j]);
		}
	    }
	    else
	    {
		scanner.close();
		throw new RuntimeException("Unsupported Question subclass");
	    }
	    
	    String answer = scanner.next();
	    
	    if (questions[i].checkAnswer(answer))
	    {
		System.out.println("Right!");
	    }
	    else
	    {
		System.out.println("Wrong!");
	    }
	    
	    System.out.println();	    
	}
	scanner.close();
    }
}
