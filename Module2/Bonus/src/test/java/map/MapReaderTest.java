package map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Map;

public class MapReaderTest
{
    private Map<String, String> m;
    
    
    @BeforeEach
    void init()
    {
	MapReader reader = new MapReader();
	try
	{
	    reader.processList(MapReader.liesKongurationsdatei());
	} catch (IOException e)
	{
	    fail();
	    e.printStackTrace();
	}
	m = reader.getConfig();
    }
    
    @Test
    void valTest()
    {
	if (!m.containsKey("mail.transport.protocol"))
		fail();
	    
	    if (!m.containsValue("smtp"))
		fail();
    }
}
