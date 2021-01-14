package map;

import java.io.*;
import java.util.*;

public class MapReader
{
    Map<String,String> config;
    
    public MapReader()
    {
	config = new HashMap<>();
    }
    
    public static List<String> liesKongurationsdatei() throws IOException
    {
	List<String> list = new ArrayList<>();
	try (BufferedReader reader = new BufferedReader(new FileReader("text.txt")))
	{
	    String str;
	    while ((str = reader.readLine()) != null)
	    {
		list.add(str);
	    }
	} catch (FileNotFoundException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	return list;
    }
    
    public void processList(List<String> list)
    {
	for (String str: list)
	{
	    int eq = str.indexOf("=");
	    String key = str.substring(0,eq);
	    String value = str.substring(eq + 1);
	    config.put(key, value);
	}
    }
    
    public static void main(String[] args) throws IOException
    {
	MapReader reader = new MapReader();
	reader.processList(MapReader.liesKongurationsdatei());	
    }

    public Map<String, String> getConfig()
    {
        return config;
    }
}
