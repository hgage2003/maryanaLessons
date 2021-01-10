package exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class BrowserTest
{
    private Browser browser;
    
    @BeforeEach
    void Init()
    {
	browser = new Browser();
    }
    
    @Test
    void testBack()
    {
	// test 10 times
	for (int i=0; i < 10; i++)
	    if (browser.back().isPresent())
		return;
	
	fail();
    }
}
