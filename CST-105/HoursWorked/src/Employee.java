
public class Employee
{
	public static final int Sunday = 0;
	public static final int Monday = 1;
	public static final int Tuesday = 2;
	public static final int Wednesday = 3;
	public static final int Thrusday = 4;
	public static final int Friday = 5;
	public static final int Saturday = 6;
	public static final int DaysInWeek = 7;
	
	private String Name;
	private int[] Hours = new int[DaysInWeek];

	public Employee(String name)
	{
		Name = name;
	}
	
	public String GetName()
	{
		return Name;
	}
	
	public void HoursWorked(int day, int hours)
	{
		if ((day >= Sunday) && (day <= Saturday))
		{
			Hours[day] = hours;
		}
	}
	
	public int TotalHoursWorked()
	{
		var total = 0;
		for (var idx = 0; idx < DaysInWeek; idx ++)
		{
			total += Hours[idx];
		}
		
		return total;
	}
}
