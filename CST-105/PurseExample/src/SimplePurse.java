
public class SimplePurse
{
	public static final double NickelValue = 0.05;
	public static final double DimeValue = 0.1;
	public static final double QuaterValue = 0.25;
	
	private int TotalNickles;
	private int TotalDimes;
	private int TotalQuaters;
	
	public SimplePurse()
	{
		TotalNickles = 0;
		TotalDimes = 0;
		TotalQuaters = 0;
	}

	public void AddNickels(int count)
	{
		TotalNickles += count;
	}

	public void AddDimes(int count)
	{
		TotalDimes += count;
	}

	public void AddQuaters(int count)
	{
		TotalQuaters += count;
	}
	
	public double GetTotal()
	{
		return (TotalNickles * NickelValue) + (TotalDimes * DimeValue) + (TotalQuaters * QuaterValue);
	}
}
