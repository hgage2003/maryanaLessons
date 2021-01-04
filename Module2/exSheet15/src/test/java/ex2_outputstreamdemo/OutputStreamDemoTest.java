package ex2_outputstreamdemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OutputStreamDemoTest
{
    static final private String text = "Hello World!";
    static final private byte[] b = text.getBytes();

    @Test
    void testOK()
    {
	assertDoesNotThrow(() -> OutputStreamDemo.write(b, 0, text.length()));
    }
    
    @Test
    void testOffsetNegative()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, -1, 5));
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, -12, -10));
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, -99, 6));
    }

    @Test
    void testLengthNegative()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, 0, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, 5, -17));
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, -5, -98));
    }

    @Test
    void testOffsetPlusLengthGreaterArrayLength() 
    {
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, 0, 25));
        assertThrows(IndexOutOfBoundsException.class, () -> OutputStreamDemo.write(b, 5, 15));
    }

    @Test
    void testThrowsNPE() 
    {
        assertThrows(NullPointerException.class, () -> OutputStreamDemo.write(null, 0, 2));
    }
}
