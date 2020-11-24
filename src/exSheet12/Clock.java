package exSheet12;

public class Clock 
{
	public Clock(int h, int m, int s)
	{
		if (correctTime(h, m, s))
		{
			hour = h;
			minute = m;
			second = s;
		}
		else
		{
			hour = 12;
			minute = second = 0;
		}
	}
	
	public int getHour() 
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public void setTime(int h, int m, int s)
	{
		if (correctTime(h, m, s))
		{
			hour = h;
			minute = m;
			second = s;
		}
		else
		{
			System.out.println("Error: wrong time in setTime");
		}
	}
	
	private boolean correctTime(int h, int m, int s)
	{
		if ((h < 0) || (h > 23))
			return false;
		if ((m < 0) || (m > 59))
			return false;
		if ((s < 0) || (s > 59))
			return false;
		
		return true;
	}
	
	public void nextSec()
	{
		if (second < 59)
			second++;
		else
		{
			second = 0;
			if (minute < 59)
				minute++;
			else
			{
				minute = 0;
				if (hour < 23)
					hour++;
				else
					hour = 0;
			}
		}
	}
	
	public int getDaySec()
	{
		return hour * 3600 + minute * 60 + second;
	}
	
	public boolean alarm(Clock alarmTime)
	{
		if ( alarmTime.getHour() == hour &&
				alarmTime.getMinute() == minute &&
				alarmTime.getSecond() == second)
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return String.format("%02d", hour)	+ ":" + String.format("%02d", minute) 
				+ ":" + String.format("%02d", second);
	}
	
	private int hour;
	private int minute;
	private int second;
}
