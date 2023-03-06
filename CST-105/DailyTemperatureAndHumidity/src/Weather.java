
public class Weather
{
	public static final int NumberOfDays = 10;
	public static final int NumberOfHours = 24;
	
	private double[][][] data = new double[NumberOfDays][NumberOfHours][2];
	
	public void Add(int day, int hour, double temperature, double humidity)
	{
		if (
				((day > 0) && (day <= NumberOfDays)) &&
				((hour > 0)	&& (hour <= NumberOfHours))
			)
		{
			data[day - 1][hour - 1][0] = temperature;
			data[day - 1][hour - 1][1] = humidity;
		}
	}
	
	public double[][] GetAverages()
	{
		double[][] averages = new double[NumberOfDays][2];
		for (var dayIdx = 0; dayIdx < NumberOfDays; dayIdx ++)
		{
			double dailyTemperatureTotal = 0;
			double dailyHumidityTotal = 0;
			
			for (var hourIdx = 0; hourIdx < NumberOfHours; hourIdx ++)
			{
				dailyTemperatureTotal += data[dayIdx][hourIdx][0];
				dailyHumidityTotal += data[dayIdx][hourIdx][1];
			}
			
			averages[dayIdx][0] = dailyTemperatureTotal / NumberOfHours;
			averages[dayIdx][1] = dailyHumidityTotal / NumberOfHours;
		}
		
		return averages;
	}
}
