
public class TimeToDouble
{
	private double StartAmount;
	private double IncreaseAmount;
	
	public TimeToDouble(double amount, double increaseAmount)
	{
		StartAmount = amount;
		IncreaseAmount = increaseAmount;
	}
	
	public int TotalTime()
	{
		var cnt = 0;
		var total = StartAmount;
		while (total  < StartAmount * 2)
		{
			total *= IncreaseAmount;
			cnt ++;
		}
		
		return cnt;
	}
}
