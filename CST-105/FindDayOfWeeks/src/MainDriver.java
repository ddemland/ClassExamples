import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		var scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		var year = scanner.nextInt();
		scanner.nextLine();
		var dayOfWeek = GetDayOfWeek(scanner);
		System.out.println("Five day of the month:");
		for (var cnt = 1; cnt <= 12; cnt ++)
		{
	        var startDate = LocalDate.of(year, cnt, 1);
			if (FindAllDaysOfWeek.GetCountOfDayInMonth(dayOfWeek, startDate) == 5)
			{
				var month = GetMonth(cnt);
		        var day = FindAllDaysOfWeek.GetLastDayOfMonth(month, year, dayOfWeek);
		        System.out.println(day.toString());
			}
		}
		
		System.out.println();
		scanner.close();
	}

	private static DayOfWeek GetDayOfWeek(Scanner scanner)
	{
		while (true)
		{
			System.out.println("Enter a day of the week to count:");
			System.out.println("    1 - Sunday");
			System.out.println("    2 - Monday");
			System.out.println("    3 - Tuesday");
			System.out.println("    4 - Wednesday");
			System.out.println("    5 - Thursday");
			System.out.println("    6 - Friday");
			System.out.println("    7 - Saturday");
			var dayOfWeek = scanner.nextInt();
			scanner.nextLine();
			if ((dayOfWeek < 1) || (dayOfWeek > 7))
			{
				System.out.println("Please enter a value between 1 and 7.");
				continue;
			}
			
			switch (dayOfWeek)
			{
				case 1:
					return DayOfWeek.SUNDAY;
				
				case 2:
					return DayOfWeek.MONDAY;
				
				case 3:
					return DayOfWeek.TUESDAY;
				
				case 4:
					return DayOfWeek.WEDNESDAY;
				
				case 5:
					return DayOfWeek.THURSDAY;
				
				case 6:
					return DayOfWeek.FRIDAY;
				
				case 7:
					return DayOfWeek.SATURDAY;
				
			}
		}
	}
	
	private static Month GetMonth(int month)
	{
		switch (month)
		{
			case 1:
				return Month.JANUARY;
				
			case 2:
				return Month.FEBRUARY;
				
			case 3:
				return Month.MARCH;
				
			case 4:
				return Month.APRIL;
				
			case 5:
				return Month.MAY;
				
			case 6:
				return Month.JUNE;
				
			case 7:
				return Month.JULY;
				
			case 8:
				return Month.AUGUST;
				
			case 9:
				return Month.SEPTEMBER;
				
			case 10:
				return Month.OCTOBER;
				
			case 11:
				return Month.NOVEMBER;
				
			default:
				return Month.DECEMBER;
				
		}
	}
}
