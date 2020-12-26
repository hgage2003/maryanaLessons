package exercise2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class StackTest
{
    private Stack<Integer> s;
    private Throwable t;
    
    @BeforeEach
    public void init()
    {
	s = new Stack<Integer>();
    }
    
    @Test
    public void testEmptyPop()
    {
	
    }
}
